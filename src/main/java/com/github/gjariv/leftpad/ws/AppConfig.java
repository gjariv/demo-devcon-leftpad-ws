package com.github.gjariv.leftpad.ws;

import javax.inject.Inject;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

    @Inject
    public AppConfig(ServiceLocator serviceLocator) {
        packages("com.github.gjariv.leftpad.ws.resources");
    }
}