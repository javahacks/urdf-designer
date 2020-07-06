package com.javahacks.urdf.server.lsp;

import com.google.inject.Injector;
import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.websocket.WebSocketEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.Collection;

/**
 * Websocket endpoint for URDF LSP server
 */
@Component
public class LspWebsocketEndpoint extends WebSocketEndpoint<LanguageClient> {

    private Provider<LanguageServer> languageServer;

    @Autowired
    public LspWebsocketEndpoint(Provider<LanguageServer> languageServer) {
        this.languageServer = languageServer;
    }

    @Override
    protected void configure(Launcher.Builder<LanguageClient> builder) {
        builder.setLocalService(languageServer.get()).setRemoteInterface(LanguageClient.class);
    }

    @Override
    protected void connect(Collection<Object> localServices, LanguageClient remoteProxy) {
        localServices.stream()
                .filter(LanguageClientAware.class::isInstance)
                .map(LanguageClientAware.class::cast)
                .forEach(service -> service.connect(remoteProxy));
    }

}

