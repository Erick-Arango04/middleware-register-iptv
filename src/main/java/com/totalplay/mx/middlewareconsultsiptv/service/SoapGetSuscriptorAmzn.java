package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapGetSuscriptorAmzn implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public String getResponse() {

		UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

		GetSuscriptorAmzn getSuscriptorAmzn = new GetSuscriptorAmzn();

		getSuscriptorAmzn.setArg0(userVo);
		getSuscriptorAmzn.setArg1("0102482373");

		GetSuscriptorAmznResponse response = (GetSuscriptorAmznResponse) soapClient
				.getResponse(objectFactory
						.createGetSuscriptorAmzn(getSuscriptorAmzn));

		return response.getReturn().getMessage();
	}

}
