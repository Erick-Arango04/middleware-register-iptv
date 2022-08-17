package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
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

	ObjectFactory objectFactory = new ObjectFactory();


    public ResponseVO getResponse(RegisterDeviceRequest registerDeviceRequest) {
       
        UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

        DeviceVO deviceVO = new DeviceVO();
        deviceVO.setAlias("");
        deviceVO.setEsn("");
        deviceVO.setIsDemo("");
        deviceVO.setIsInternal("");
        deviceVO.setIsTest("");
        deviceVO.setMac("");
     
        RegisterDevice registerDevice = new RegisterDevice();

        registerDevice.setArg0(userVo);
        registerDevice.setArg1("");
        registerDevice.setArg2(deviceVO);



        RegisterDeviceResponse response = (RegisterDeviceResponse) soapClient
        .getResponse(objectFactory.createRegisterDevice(registerDevice)); 
 
        return response.getReturn();
    }
}
