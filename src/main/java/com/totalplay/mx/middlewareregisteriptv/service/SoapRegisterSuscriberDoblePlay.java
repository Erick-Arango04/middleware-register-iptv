package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.middlewareregisteriptv.config.SoapLoginApp;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDoblePlayRequest;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriberDoblePlay;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriberDoblePlayResponse;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;
import com.totalplay.mx.registeriptv.wsdl.SuscriptorVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;


@Service
public class SoapRegisterSuscriberDoblePlay implements GetRegisterSuscriptorResponse {

	@Autowired
	private SoapClient soapClient;
    @Autowired
    private SoapLoginApp soapLoginApp;

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public ResponseVO getResponse( RegisterDoblePlayRequest request ) {

        UserVO userVo = new UserVO();
		userVo.setIp(soapLoginApp.getIp());
		userVo.setUser(soapLoginApp.getUser());
		userVo.setPassword(soapLoginApp.getPassword());

        SuscriptorVO  suscriptorVO = new SuscriptorVO();
        suscriptorVO.setContract(request.getContract());
        suscriptorVO.setEmail(request.getEmail());
        suscriptorVO.setFirstName(request.getFirstName());
        suscriptorVO.setIdTypeContract(request.getIdTypeContract());
        suscriptorVO.setLastName(request.getLastName());
        suscriptorVO.setLatitude(request.getLatitude());
        suscriptorVO.setLongitude(request.getLongitude());
        suscriptorVO.setRegionId(request.getRegionId());
        suscriptorVO.setSusStyId(request.getSus_sty_id());
        suscriptorVO.setZipCode(request.getZipCode());


        RegisterSuscriberDoblePlay registerSuscriberDoblePlay = new RegisterSuscriberDoblePlay();

        registerSuscriberDoblePlay.setArg0(userVo);
        registerSuscriberDoblePlay.setArg1(suscriptorVO);
        registerSuscriberDoblePlay.setArg3("0");

        RegisterSuscriberDoblePlayResponse response = (RegisterSuscriberDoblePlayResponse) soapClient
        .getResponse(objectFactory.createRegisterSuscriberDoblePlay(registerSuscriberDoblePlay)); 
       
		return response.getReturn();
    }

}



       
 


