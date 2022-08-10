package com.totalplay.mx.middlewareregisteriptv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.totalplay.mx.middlewareregisteriptv.service.SoapRegisterBundle;


@RestController
@RequestMapping("/provisionig/register-iptv")
public class SoapController {

	@Autowired
	private SoapRegisterBundle soapRegisterBundle;
	
	@PostMapping("/registerBundle")
	public Object registerBundle() {
	 	return soapRegisterBundle.getResponse();
	}

}
