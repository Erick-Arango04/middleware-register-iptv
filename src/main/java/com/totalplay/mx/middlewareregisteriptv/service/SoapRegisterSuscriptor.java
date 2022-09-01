package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDoblePlayRequest;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriptor;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriptorResponse;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;
import com.totalplay.mx.registeriptv.wsdl.SuscriptorVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;

@Service
public class SoapRegisterSuscriptor implements GetRegisterSuscriptorResponse {

	@Autowired
	private SoapClient soapClient;
    @Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public ResponseVO getResponse(RegisterDoblePlayRequest request) {
     
        UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

        SuscriptorVO  suscriptorVO = new SuscriptorVO();

        suscriptorVO.setContract(request.getContract());
        suscriptorVO.setEmail(request.getEmail());
        suscriptorVO.setName(request.getName());
        suscriptorVO.setFirstName(request.getFirstName());
        suscriptorVO.setIdTypeContract(Integer.valueOf(request.getIdTypeContract()));
        suscriptorVO.setLastName(request.getLastName());
        suscriptorVO.setLatitude(request.getLatitude());
        suscriptorVO.setLongitude(request.getLongitude());
        suscriptorVO.setRegionId(Integer.valueOf(request.getRegionId()));
        suscriptorVO.setSusStyId(Integer.valueOf(request.getSus_sty_id()));
        suscriptorVO.setZipCode(request.getZipCode());
        suscriptorVO.setZone(request.getZone());

        RegisterSuscriptor registerSuscriptor = new RegisterSuscriptor();
       
        registerSuscriptor.setArg0(userVo);
        registerSuscriptor.setArg1(suscriptorVO);
        registerSuscriptor.setArg2("");
        registerSuscriptor.setArg3("0");

        RegisterSuscriptorResponse response = (RegisterSuscriptorResponse) soapClient
        .getResponse(objectFactory.createRegisterSuscriptor(registerSuscriptor)); 
       
		 
           return  response.getReturn();
    }
    
}
