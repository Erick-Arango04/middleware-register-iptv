package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDeviceRequest;
import com.totalplay.mx.registeriptv.wsdl.DeviceVO;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterDevice;
import com.totalplay.mx.registeriptv.wsdl.RegisterDeviceResponse;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;



@Service
public class SoapRegisterDevice {

	@Autowired
	private SoapClient soapClient;
    @Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();


    public ResponseVO getResponse(RegisterDeviceRequest registerDeviceRequest) {
       
        UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

        DeviceVO deviceVO = new DeviceVO();
        deviceVO.setAlias(registerDeviceRequest.getAlias());
        deviceVO.setEsn(registerDeviceRequest.getEsn());
        deviceVO.setMac(registerDeviceRequest.getMac());
        deviceVO.setUserAgent(registerDeviceRequest.getUserAgent());
       
        RegisterDevice registerDevice = new RegisterDevice();

        registerDevice.setArg0(userVo);
        registerDevice.setArg1(registerDeviceRequest.getAccount());
        registerDevice.setArg2(deviceVO);

        RegisterDeviceResponse response = (RegisterDeviceResponse) soapClient
        .getResponse(objectFactory.createRegisterDevice(registerDevice)); 
 
        return response.getReturn();
    }
}
