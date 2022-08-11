package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.registeriptv.wsdl.BundleVO;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundle;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundleResponse;
import com.totalplay.mx.registeriptv.wsdl.UserVO;



@Service
public class SoapRegisterBundle implements GetRegisterResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public Object getResponse() {

		UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

        BundleVO bundleVO = new BundleVO();

        bundleVO.setIdCco(1450);
        bundleVO.setTmCode("124505307470");

        RegisterBundle registerBundle = new RegisterBundle();
        
        registerBundle.setArg0(userVo);
        registerBundle.setArg1("0103529247");
        registerBundle.setArg2(bundleVO);
        
        RegisterBundleResponse response = (RegisterBundleResponse) soapClient
        .getResponse(objectFactory.createRegisterBundle(registerBundle)); 
       
		return response.getReturn();
	}

	
	

	

}
