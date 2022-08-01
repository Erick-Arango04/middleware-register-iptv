package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.BundleNtflxVO;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptor;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapGetSusccriptor implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public Object getResponse() {

		UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

		SearchVO searchVo = new SearchVO();

		searchVo.setContract("0100043710");

		GetSuscriptor getSuscriptor = new GetSuscriptor();

		getSuscriptor.setArg0(userVo);
		getSuscriptor.setArg1(searchVo);

		GetSuscriptorResponse response = (GetSuscriptorResponse) soapClient
				.getResponse(objectFactory.createGetSuscriptor(getSuscriptor));

		return response.getReturn().getSuscriptorVO();
	}

}
