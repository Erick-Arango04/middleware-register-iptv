package com.totalplay.mx.middlewareregisteriptv.controller;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleRequest;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDeviceRequest;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SoapControllerTest {

    @Autowired
    private SoapController soapController;


    @BeforeAll
    public void start() {

        soapController = new SoapController();
        
    }

    @Test
    public void testRegisterBundle() {
        RegisterBundleRequest registerBundle = new RegisterBundleRequest();
        registerBundle.setAccount("0999059999");
        registerBundle.setTmCode("10754_10754");

        ResponseVO response = soapController.registerBundle(registerBundle);

      assertEquals(response.getCode(), -201);
  

    }

    @Test
    public void testRegisterDevice() {

        RegisterDeviceRequest registerDeviceRequest = new RegisterDeviceRequest();
        registerDeviceRequest.setAccount("0999059999");
        registerDeviceRequest.setAlias("user_1");
        registerDeviceRequest.setEsn("M37210942652EE99C1");
        registerDeviceRequest.setUserAgent("M370");
        registerDeviceRequest.setMac("58:2f:f7:e8:c2:83");
    
        ResponseVO response =  soapController.registerDevice(registerDeviceRequest);

        assertEquals(response.getCode(), -201);

    }

   
}
