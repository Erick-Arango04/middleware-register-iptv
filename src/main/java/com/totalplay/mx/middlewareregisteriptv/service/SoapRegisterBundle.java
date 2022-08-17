package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.registeriptv.wsdl.BundleVO;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundle;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundleResponse;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;



@Service
public class SoapRegisterBundle{

	@Autowired
	private SoapClient soapClient;
    @Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

    
    public ResponseVO getResponse() {

		UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

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
