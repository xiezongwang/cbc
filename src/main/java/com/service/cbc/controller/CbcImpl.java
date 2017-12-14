package com.service.cbc.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-14T12:17:33.846Z")

@RestSchema(schemaId = "cbc")
@RequestMapping(path = "/cbc", produces = MediaType.APPLICATION_JSON)
public class CbcImpl {

    @Autowired
    private CbcDelegate userCbcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCbcDelegate.helloworld(name);
    }

}
