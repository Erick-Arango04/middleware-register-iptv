package com.totalplay.mx.middlewareregisteriptv.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDeviceRequest;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;


@SpringBootTest
@RunWith(SpringRunner.class)
public class SoapRegisterDeviceTest {

    @Autowired
    private SoapRegisterDevice soapRegisterDevice;

    @BeforeAll
    public void start() {
        soapRegisterDevice = new SoapRegisterDevice();

    }

    @Test
    public void testGetResponse() {

        RegisterDeviceRequest registerDeviceRequest = new RegisterDeviceRequest();
        registerDeviceRequest.setAccount("0999059999");
        registerDeviceRequest.setAlias("user_1");
        registerDeviceRequest.setEsn("M37210942652EE99C1");
        registerDeviceRequest.setUserAgent("M370");
        registerDeviceRequest.setMac("58:2f:f7:e8:c2:83");

        ResponseVO response = soapRegisterDevice.getResponse(registerDeviceRequest);

        Assert.assertEquals(response.getCode(), -201);

    }
}
