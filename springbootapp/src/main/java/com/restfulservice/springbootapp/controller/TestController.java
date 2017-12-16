package com.restfulservice.springbootapp.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

@Component
@Path("/health")
public class TestController {
	@GET
    @Produces("application/json")
    public Health health() {
        return new Health("Jersey: Up and Running!");
    }
}
