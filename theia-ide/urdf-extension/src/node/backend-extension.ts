(global as any).WebSocket = require('ws');
import { injectable, ContainerModule } from "inversify";
import { Application } from "express";
import { createProxyServer } from 'http-proxy';
import { BaseLanguageServerContribution, LanguageServerContribution, IConnection } from "@theia/languages/lib/node";
import {toSocket,WebSocketMessageReader,WebSocketMessageWriter} from 'vscode-ws-jsonrpc'
import {createConnection} from 'vscode-ws-jsonrpc/lib/server';
import { BackendApplicationContribution } from "@theia/core/lib/node";


export default new ContainerModule(bind => {
    bind<LanguageServerContribution>(LanguageServerContribution).to(DSLContribution);
    bind<BackendApplicationContribution>(BackendApplicationContribution).to(ProxyServer);
});

const DEFAULT_LSP_PORT = 8080;
const DEFAULT_LSP_SERVER = '127.0.0.1';

function getPort(): number{
    let arg = process.argv.filter(arg => arg.startsWith('--LSP_PORT='))[0]
    if (!arg) {
        return DEFAULT_LSP_PORT;
    } else {
        return Number.parseInt(arg.substring('--LSP_PORT='.length))
    }
}

function getServer(): string{
    let arg = process.argv.filter(arg => arg.startsWith('--LSP_SERVER='))[0]
    if (!arg) {
        return DEFAULT_LSP_SERVER;
    } else {
        return arg.substring('--LSP_SERVER='.length)
    }
}


@injectable()
class DSLContribution extends BaseLanguageServerContribution {
    
    readonly id = "urdf";
    readonly name = "URDF";

    start(clientConnection: IConnection): void {

            const websocketURL = "ws://" + getServer() + ":" + getPort() + "/lsp";

            const websocket = new WebSocket(websocketURL);
            const socket= toSocket(websocket);
            const reader = new WebSocketMessageReader(socket);
            const writer = new WebSocketMessageWriter(socket);
            const socketConnection = createConnection(reader, writer, () => socket.dispose);
                    
            websocket.onopen = () => {
                super.forward(clientConnection, socketConnection);
                console.log("LSP: established websocket connection: " + websocketURL);
            };
            
    }
}



/**
 * Used to delegate all 'URDF' related requests to java backend
 */
@injectable()
class ProxyServer implements BackendApplicationContribution {
        
    configure?(app: Application){
        const apiProxy = createProxyServer();                    
        app.all("/urdf/*", function(req, res) {                       
            apiProxy.web(req, res, {target: "http://"+ getServer() +":" + getPort()});
        });       
    }
}



