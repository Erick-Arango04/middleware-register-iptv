package com.totalplay.mx.middlewareregisteriptv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterBundle;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterDevice;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterSuscriberDoblePlay;
import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterSuscriptor;
import org.springframework.web.bind.annotation.RequestBody;



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
	public Object registerBundle() {
	 	return soapRegisterBundle.getResponse();
	}


	@PostMapping("/registerSuscriptor")
	public Object registerSuscriptor () {
		return soapRegisterSuscriptor.getResponse();
	}
	
	@PostMapping("/registerSuscriberDoblePlay")
	public Object registerSuscriberDoblePlay() {
		return soapRegisterSuscriberDoblePlay.getResponse();
	}
	
	@PostMapping("/registerDevice")
	public Object registerDevice() {
		return soapRegisterDevice.getResponse();
	}
	
}
