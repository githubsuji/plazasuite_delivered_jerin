package com.restfulservice.springbootapp.controller;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@ApplicationPath("/service")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(TestController.class);
    }
}