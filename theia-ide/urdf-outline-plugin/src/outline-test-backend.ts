
/**
 * Generated using theia-plugin-generator
 */


import * as theia from '@theia/plugin';

export function start(context: theia.PluginContext) {
    const informationMessageTestCommand = {
        id: 'hello-world-example-generated',
        label: "Start Cycling"
    };
    context.subscriptions.push(theia.commands.registerCommand(informationMessageTestCommand, (...args: any[]) => {                        
        theia.window.showInformationMessage('Hello World Racessss12  !');
    }));
    context.subscriptions.push(
        theia.languages.registerDocumentSymbolProvider(
            {scheme: "file", language: "urdf"}, 
            new SwmfConfigDocumentSymbolProvider())
    );
    
}

export function stop() {

}

class SwmfConfigDocumentSymbolProvider implements theia.DocumentSymbolProvider {
    public provideDocumentSymbols(
        document: theia.TextDocument,
        token: theia.CancellationToken): Promise<theia.DocumentSymbol[]> {
            
        return new Promise((resolve, reject) => {
            let symbols: theia.DocumentSymbol[] = [];
            for (var i = 0; i < document.lineCount; i++) {
                var line = document.lineAt(i);        
                let materialMatch = line.text.match(/^\s*((color|material)\s+\S+)\s+/)            
                this.fillSymbols(materialMatch, line, symbols,theia.SymbolKind.Constant);            
                
                let meshMatch = line.text.match(/^\s*((box|sphere|mesh|cylinder)\s+\S+)\s+/)            
                this.fillSymbols(meshMatch, line, symbols,theia.SymbolKind.Object);            

                let jointMatch = line.text.match(/^\s*((revolute|prismatic|fixed|continous)\s+\S+)\s+/)            
                this.fillSymbols(jointMatch, line, symbols,theia.SymbolKind.Method);            
            }
            resolve(symbols);
        });
    }

    private fillSymbols(meshMatch: RegExpMatchArray | null, line: theia.TextLine, symbols: theia.DocumentSymbol[],kind: theia.SymbolKind) {
        if (meshMatch) {
            let symbol = new theia.DocumentSymbol(meshMatch[1], "", kind, line.range, line.range);            
            symbols.push(symbol);
        }
    }
}