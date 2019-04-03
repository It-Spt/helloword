package com.spt.helloworld.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.SpringComponentProvider;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("com.spt.helloworld")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("com.eglsc");
        register(JacksonFeature.class);
        register(RequestContextFilter.class);
        register(SpringComponentProvider.class);
    }
}
