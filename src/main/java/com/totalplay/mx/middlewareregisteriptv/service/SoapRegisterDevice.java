package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterDevice;
import com.totalplay.mx.registeriptv.wsdl.RegisterDeviceResponse;



@Service
public class SoapRegisterDevice implements GetRegisterResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public Object getResponse() {
       
        RegisterDevice registerDevice = new RegisterDevice();

        RegisterDeviceResponse response = (RegisterDeviceResponse) soapClient
        .getResponse(objectFactory.createRegisterDevice(registerDevice)); 
 
        return null;
    }
}
