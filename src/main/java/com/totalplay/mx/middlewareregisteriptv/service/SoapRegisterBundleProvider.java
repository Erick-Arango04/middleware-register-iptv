package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleProviderRequest;
import com.totalplay.mx.registeriptv.wsdl.BundleVO;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundleProvider;
import com.totalplay.mx.registeriptv.wsdl.RegisterBundleProviderResponse;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;

@Service
public class SoapRegisterBundleProvider {
    
    @Autowired
	private SoapClient soapClient;
    @Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

    public ResponseVO getResponse(RegisterBundleProviderRequest value) {

        UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

        BundleVO bundleVO = new BundleVO();
      //  bundleVO.setCharge(value.getCharge());
          bundleVO.setIdCco(1450);
          bundleVO.setTmCode(value.getTmCode());

        RegisterBundleProvider registerBundleProvider = new RegisterBundleProvider();
        registerBundleProvider.setArg0(userVo);
        registerBundleProvider.setArg1(value.getAccount());
        registerBundleProvider.setArg2(bundleVO);
        registerBundleProvider.setArg3(value.getPartner());


        RegisterBundleProviderResponse response = (RegisterBundleProviderResponse) soapClient
        .getResponse(objectFactory.createRegisterBundleProvider(registerBundleProvider)); 

         return response.getReturn();
        
    }
    
}
