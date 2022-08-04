package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
	
	// Valores traidos desde el properties
	@Value("${value.ip}")
	private String ip;
	
	@Value("${value.user}")
	private String user;
	
	@Value("${value.password}")
	private String password;

	@Override
	public Object getResponse(String account) {

		UserVO userVo = new UserVO();
		userVo.setIp(ip);
		userVo.setUser(user);
		userVo.setPassword(password);

		SearchVO searchVo = new SearchVO();

		searchVo.setContract(account);

		GetSuscriptor getSuscriptor = new GetSuscriptor();

		getSuscriptor.setArg0(userVo);
		getSuscriptor.setArg1(searchVo);

		GetSuscriptorResponse response = (GetSuscriptorResponse) soapClient
				.getResponse(objectFactory.createGetSuscriptor(getSuscriptor));

		return response.getReturn();
	}

}
