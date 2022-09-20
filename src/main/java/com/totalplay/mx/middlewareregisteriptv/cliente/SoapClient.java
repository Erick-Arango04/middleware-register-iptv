package com.totalplay.mx.middlewareregisteriptv.cliente;

import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import com.totalplay.mx.middlewareregisteriptv.config.SoapConfigWsdl;

public class SoapClient extends WebServiceGatewaySupport {

	@Autowired
	private SoapConfigWsdl soapConfigWsdl;

	public Object getResponse(Object request) {

	    
		JAXBElement res = (JAXBElement) getWebServiceTemplate()
				.marshalSendAndReceive(soapConfigWsdl.getPackregister() , request);
		return res.getValue();

	}
}
