package com.totalplay.mx.middlewareregisteriptv.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.totalplay.mx.middlewareregisteriptv.cliente.SoapClient;

@Configuration
public class SoapConfig {

	@Autowired
	private SoapConfigWsdl soapConfigWsdl;

	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath(soapConfigWsdl.getRegister());
		return marshaller;
	}

	@Bean
	public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
		SoapClient client = new SoapClient();
		client.setDefaultUri(soapConfigWsdl.getPackregister());
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
