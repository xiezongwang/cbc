package com.service.cbc.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-12-16T08:55:34.634Z")


@RestSchema(schemaId = "cbc")
@Path("/cbc")

@Produces({ "application/json" })
public class CbcImpl  {

    @Autowired
    private CbcDelegate cbcDelegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return cbcDelegate.helloworld(name) + "xzw";
    }
}

