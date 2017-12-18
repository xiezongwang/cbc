package com.service.cbc.controller;

import org.springframework.stereotype.Component;


@Component
public class CbcDelegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return name + "123";
    }
}
