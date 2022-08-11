package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
import com.totalplay.mx.registeriptv.wsdl.ObjectFactory;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriberDoblePlay;
import com.totalplay.mx.registeriptv.wsdl.RegisterSuscriberDoblePlayResponse;
import com.totalplay.mx.registeriptv.wsdl.SuscriptorVO;
import com.totalplay.mx.registeriptv.wsdl.UserVO;


@Service
public class SoapRegisterSuscriberDoblePlay implements GetRegisterResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public Object getResponse() {
       
        UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

        SuscriptorVO  suscriptorVO = new SuscriptorVO();

        suscriptorVO.setContract("0106617251");
        suscriptorVO.setEmail("mail@mail.com");
        suscriptorVO.setFirstName("Pedro");
        suscriptorVO.setIdTypeContract(50);
        suscriptorVO.setLastName("Arango");
        suscriptorVO.setLatitude("-654685489584684694");
        suscriptorVO.setLongitude("654654654654654645");
        suscriptorVO.setRegionId(9);
        suscriptorVO.setSusStyId(1);
        suscriptorVO.setZipCode("15000");


        RegisterSuscriberDoblePlay registerSuscriberDoblePlay = new RegisterSuscriberDoblePlay();

        registerSuscriberDoblePlay.setArg0(userVo);
        registerSuscriberDoblePlay.setArg1(suscriptorVO);
        registerSuscriberDoblePlay.setArg3("0");

        RegisterSuscriberDoblePlayResponse response = (RegisterSuscriberDoblePlayResponse) soapClient
        .getResponse(objectFactory.createRegisterSuscriberDoblePlay(registerSuscriberDoblePlay)); 
       
		return response.getReturn();
    }

}
