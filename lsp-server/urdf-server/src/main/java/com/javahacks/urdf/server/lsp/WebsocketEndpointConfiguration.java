package com.javahacks.urdf.server.lsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;
import org.springframework.web.socket.server.standard.ServerEndpointRegistration;

import javax.inject.Inject;

@Configuration
public class WebsocketEndpointConfiguration {

    private LspWebsocketEndpoint lspEndpoint;

    @Autowired
    public WebsocketEndpointConfiguration(LspWebsocketEndpoint websocketEndpoint) {
        this.lspEndpoint = websocketEndpoint;
    }

    @Bean
    public ServerEndpointRegistration createEndpointRegistration() {
        return new ServerEndpointRegistration("/lsp", lspEndpoint);
    }

    @Bean
    public ServerEndpointExporter endpointExporter() {
        return new ServerEndpointExporter();
    }

}
