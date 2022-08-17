package com.totalplay.mx.middlewareregisteriptv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDeviceRequest;
import com.totalplay.mx.middlewareregisteriptv.modelRequest.RegisterDoblePlayRequest;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterBundle;
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
	
	@PostMapping("/registerBundle")
	public ResponseVO registerBundle() {
	 	return soapRegisterBundle.getResponse();
	}

	@PostMapping("/registerSuscriptor")
	public Object registerSuscriptor (@RequestBody RegisterDoblePlayRequest registerDoblePlayRequest) {
		return soapRegisterSuscriptor.getResponse(registerDoblePlayRequest);
	}
	
	@PostMapping("/registerSuscriberDoblePlay")
	public ResponseVO registerSuscriberDoblePlay(@RequestBody RegisterDoblePlayRequest registerDoblePlayRequest) {
		return soapRegisterSuscriberDoblePlay.getResponse(registerDoblePlayRequest);
	}
	
	@PostMapping("/registerDevice")
	public ResponseVO registerDevice(@RequestBody RegisterDeviceRequest registerDeviceRequest) {
		return soapRegisterDevice.getResponse(registerDeviceRequest);
	}

	
	/*
	 * 	@PostMapping("/registerBundleProvider")
	public SomeEnityData registerBundleProvider() {
		
		
		return entity;
	}
	
	@PostMapping("/registerAddonProvider")
	public SomeEnityData registerBundleProvider() {
		
		
		return entity;
	}
	 * 
	 */

	
}

