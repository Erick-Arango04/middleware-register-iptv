package com.totalplay.mx.middlewareconsultsiptv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmzn;
import com.totalplay.mx.consultsipts.wsdl.GetSuscriptorAmznResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.SuscriptorAmznVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapGetSuscriptorAmzn implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;

	// Valores traidos desde el properties
	@Value("${value.ip}")
	private String ip;
	
	@Value("${value.user}")
	private String user;
	
	@Value("${value.password}")
	private String password;
	
	ObjectFactory objectFactory = new ObjectFactory();
	

	@Override
	public SuscriptorAmznVO getResponse(String account) {

		UserVO userVo = new UserVO();
		userVo.setIp(ip);
		userVo.setUser(user);
		userVo.setPassword(password);

		GetSuscriptorAmzn getSuscriptorAmzn = new GetSuscriptorAmzn();

		getSuscriptorAmzn.setArg0(userVo);
		getSuscriptorAmzn.setArg1(account);

		GetSuscriptorAmznResponse response = (GetSuscriptorAmznResponse) soapClient
				.getResponse(objectFactory
						.createGetSuscriptorAmzn(getSuscriptorAmzn));

		return response.getReturn();
	}

}
