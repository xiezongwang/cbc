package com.service.cbc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCbc {

      CbcDelegate cbcDelegate = new CbcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "helloxzw"; // You should put the expect String type value here.

        String returnValue = cbcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
