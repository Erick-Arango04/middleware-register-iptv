package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totalplay.mx.consultsipts.wsdl.BundleNtflxVO;
import com.totalplay.mx.consultsipts.wsdl.BundlesVO;
import com.totalplay.mx.consultsipts.wsdl.GetCatalogBundlesNetflix;
import com.totalplay.mx.consultsipts.wsdl.GetCatalogBundlesNetflixResponse;
import com.totalplay.mx.consultsipts.wsdl.ObjectFactory;
import com.totalplay.mx.middlewareconsultsiptv.cliente.SoapClient;

@Service
public class SoapGetCatalogBundlesNetflix implements GetConsultResponse {

	@Autowired
	private SoapClient soapClient;

	ObjectFactory objectFactory = new ObjectFactory();

	@Override
	public List<BundleNtflxVO> getResponse() {

		GetCatalogBundlesNetflix getCatalogNetflix = new GetCatalogBundlesNetflix();

		GetCatalogBundlesNetflixResponse response = (GetCatalogBundlesNetflixResponse) soapClient
				.getResponse(objectFactory
						.createGetCatalogBundlesNetflix(getCatalogNetflix));

		List<BundleNtflxVO> bundlesListNetflix = response.getReturn()
				.getBundles();

		return bundlesListNetflix;
	}

}
