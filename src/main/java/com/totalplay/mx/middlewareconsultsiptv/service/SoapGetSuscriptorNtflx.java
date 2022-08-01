package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorNtflx;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorNtflxResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapGetSuscriptorNtflx {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();
	
	public String getResponseSuscriptorNtflx(){
		
		UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

		GetSuscriptorNtflx getSuscriptorNtflx = new GetSuscriptorNtflx();
		
		getSuscriptorNtflx.setArg0(userVo);
		getSuscriptorNtflx.setArg1("0102482373");
		
		GetSuscriptorNtflxResponse response = (GetSuscriptorNtflxResponse) 
				soapClient.getResponse(objectFactory.createGetSuscriptorNtflx(getSuscriptorNtflx));
		
		return response.getReturn().getMessage();
		
		
	}

	
	
}
