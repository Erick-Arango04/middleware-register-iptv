package com.totalplay.mx.middlewareregisteriptv.cliente;

import javax.xml.bind.JAXBElement;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {

	public Object getResponse(Object request) {

		JAXBElement res = (JAXBElement) getWebServiceTemplate()
				.marshalSendAndReceive(
						"http://10.213.8.246/Register/RegisterService", request);
		return res.getValue();

	}
}
