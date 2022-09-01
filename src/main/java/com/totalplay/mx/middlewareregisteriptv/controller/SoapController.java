package com.totalplay.mx.middlewareregisteriptv.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleRequest;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterBundleProviderRequest;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDeviceRequest;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDoblePlayRequest;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterBundle;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterBundleProvider;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterDevice;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterSuscriberDoblePlay;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterSuscriptor;
import com.totalplay.mx.registeriptv.wsdl.ResponseVO;




@RestController
@RequestMapping("/provisionig/register-iptv")
public class SoapController {

	@Autowired
	private SoapRegisterBundle soapRegisterBundle;

	@Autowired
	private SoapRegisterSuscriptor soapRegisterSuscriptor;

	@Autowired
	private SoapRegisterSuscriberDoblePlay soapRegisterSuscriberDoblePlay;

	@Autowired
	private SoapRegisterDevice soapRegisterDevice;

	@Autowired
	private SoapRegisterBundleProvider soapRegisterBundleProvider;


	
	@PostMapping("/registerBundle")
	public ResponseVO registerBundle(@Valid @RequestBody RegisterBundleRequest registerBundle) {
	 	return soapRegisterBundle.getResponse(registerBundle);
	}

	@PostMapping("/registerSuscriptor")
	public ResponseVO registerSuscriptor (@Valid @RequestBody RegisterDoblePlayRequest registerDoblePlayRequest) {
		return soapRegisterSuscriptor.getResponse(registerDoblePlayRequest);
	}
	
	@PostMapping("/registerSuscriberDoblePlay")
	public ResponseVO registerSuscriberDoblePlay(@Valid @RequestBody RegisterDoblePlayRequest registerDoblePlayRequest) {
		return soapRegisterSuscriberDoblePlay.getResponse(registerDoblePlayRequest);
	}
	
	@PostMapping("/registerDevice")
	public ResponseVO registerDevice(@Valid @RequestBody RegisterDeviceRequest registerDeviceRequest) {
		return soapRegisterDevice.getResponse(registerDeviceRequest);
	}

	
    @PostMapping("/registerBundleProvider")
	public ResponseVO registerBundleProvider(@Valid @RequestBody RegisterBundleProviderRequest request) {
		return soapRegisterBundleProvider.getResponse(request);
	

	}
	/*
	 * 	
	
	
	@PostMapping("/registerAddonProvider")
	public SomeEnityData registerBundleProvider() {
		
		
		return entity;
	}
	 * 
	 */

	
}

