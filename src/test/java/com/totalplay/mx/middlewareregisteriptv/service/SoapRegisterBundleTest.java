package com.totalplay.mx.middlewareregisteriptv.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleRequest;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SoapRegisterBundleTest {

    @Autowired
   private SoapRegisterBundle soapRegisterBundle;
    

    @BeforeAll
   public void start() {
    soapRegisterBundle = new SoapRegisterBundle();

   }


    @Test
    public void testGetResponse() {

        RegisterBundleRequest registerBundle = new RegisterBundleRequest();
        registerBundle.setAccount("0999059999");
        registerBundle.setTmCode("10754_10754");

        ResponseVO response = soapRegisterBundle.getResponse(registerBundle);

        assertEquals(response.getCode(), -201);

    }
}
