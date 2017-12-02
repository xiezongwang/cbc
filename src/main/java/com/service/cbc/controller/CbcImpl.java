package com.service.cbc.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-12-02T10:48:44.646Z")


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

    	return cbcDelegate.helloworld(name);
    }
    
    @Path("/add")
    @GET
    @Produces({ "application/json" })
    public String add(@QueryParam("name") String name) {

    	return "yyyy"
    }
    
}

