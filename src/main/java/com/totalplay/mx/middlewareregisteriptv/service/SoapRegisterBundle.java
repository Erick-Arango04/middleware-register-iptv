package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleRequest;
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

    
    public ResponseVO getResponse(RegisterBundleRequest registerBundle2) {

		UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

        BundleVO bundleVO = new BundleVO();

        bundleVO.setCharge(false);
        bundleVO.setExpiration(registerBundle2.getExpiration());
        bundleVO.setIdCco(Integer.parseInt("1450"));
        bundleVO.setSession(registerBundle2.getSession());
        bundleVO.setTmCode(registerBundle2.getTmCode());

        RegisterBundle registerBundle = new RegisterBundle();
        
        registerBundle.setArg0(userVo);
        registerBundle.setArg1(registerBundle2.getAccount());
        registerBundle.setArg2(bundleVO);
        
        RegisterBundleResponse response = (RegisterBundleResponse) soapClient
        .getResponse(objectFactory.createRegisterBundle(registerBundle)); 
       
		return response.getReturn();
	}

	
	

	

}
