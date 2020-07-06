package com.javahacks.urdf.server.lsp;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.xtext.ide.server.ServerModule;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.ros.urdf.DslStandaloneSetup;
import org.ros.urdf.ide.DslIdeSetup;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configures all XText related beans
 */
@Configuration
public class XTextConfigurer {
    private final Injector injector;

    public XTextConfigurer() {
        DslStandaloneSetup.doSetup();
        injector = Guice.createInjector(new ServerModule());
    }

    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    public LanguageServer createInjector() {
        return injector.getInstance(LanguageServer.class);
    }

    @Bean
    public ResourceSet createResourceSet() {
        return injector.getInstance(XtextResourceSet.class);
    }


}
