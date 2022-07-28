package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.BundlesVO;
import com.totalplay.mx.consultsipts.wsdl.GetBundleBySuscriptor;
import com.totalplay.mx.consultsipts.wsdl.GetBundleBySuscriptorResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.consultsipts.wsdl.SearchVO;
import com.totalplay.mx.consultsipts.wsdl.UserVO;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapServiceGetBundleBySuscriptor {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	public List<BundlesVO> getBundles() {

		UserVO userVo = new UserVO();
		userVo.setIp("10.216.8.40");
		userVo.setUser("IU400476");
		userVo.setPassword("IU400476TP2013");

		SearchVO searchVo = new SearchVO();

		searchVo.setContract("0100043710");

		GetBundleBySuscriptor getBunddlebySuscriptor = new GetBundleBySuscriptor();

		getBunddlebySuscriptor.setArg0(userVo);
		getBunddlebySuscriptor.setArg1(searchVo);

		GetBundleBySuscriptorResponse response = (GetBundleBySuscriptorResponse) soapClient
				.getResponse(objectFactory
						.createGetBundleBySuscriptor(getBunddlebySuscriptor));

		List<BundlesVO> bundlesList = response.getReturn().getBundles();

		return bundlesList;

	}

}
