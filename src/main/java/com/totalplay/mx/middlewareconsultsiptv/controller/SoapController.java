package com.totalplay.mx.middlewareconsultsiptv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.consultsipts.wsdl.BundleNtflxVO;
import com.totalplay.mx.consultsipts.wsdl.BundlesVO;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetCatalogBundlesAmzn;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapGetCatalogBundlesNetflix;
import com.totalplay.mx.middlewareconsultsiptv.service.SoapServiceGetBundleBySuscriptor;

@RestController
@RequestMapping("/provisionig/consults-iptv")
public class SoapController {

	@Autowired
	private SoapServiceGetBundleBySuscriptor soapServiceGetBundleBySuscriptor;

	@Autowired
	private SoapGetCatalogBundlesNetflix soapGetCatalogBundlesNetflix;

	@Autowired
	private SoapGetCatalogBundlesAmzn soapGetCatalogBundlesAmzn;
	
	

	@PostMapping("/getBundleBySuscriptor")
	public List<BundlesVO> getBundleBySuscriptor() {

		return soapServiceGetBundleBySuscriptor.getBundles();

	}

	@PostMapping("/getCatalogBundlesAmzn")
	public List<BundleNtflxVO> getCatalogBundlesAmzn() {

		return soapGetCatalogBundlesAmzn.getBundlesAmzn();

	}

	@PostMapping("/getCatalogBundlesNetflix")
	public List<BundleNtflxVO> getCatalogBundlesNetflix() {

		return soapGetCatalogBundlesNetflix.getBundlesNetflix();

	}

}