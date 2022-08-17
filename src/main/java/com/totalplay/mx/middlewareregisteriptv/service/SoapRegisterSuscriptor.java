package com.totalplay.mx.middlewareregisteriptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;
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

	ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public ResponseVO getResponse(RegisterDoblePlayRequest registerDoblePlayRequest) {
     
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
        


        RegisterSuscriptor registerSuscriptor = new RegisterSuscriptor();
       
        registerSuscriptor.setArg0(userVo);
        registerSuscriptor.setArg1(suscriptorVO);
        registerSuscriptor.setArg3("0");

        RegisterSuscriptorResponse response = (RegisterSuscriptorResponse) soapClient
        .getResponse(objectFactory.createRegisterSuscriptor(registerSuscriptor)); 
       
		return response.getReturn();
    }
    
}
