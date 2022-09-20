package com.totalplay.mx.middlewareregisteriptv.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@ConfigurationProperties(prefix ="wsdl")
@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SoapConfigWsdl {

 private String register; 
 private String packregister;
    
}
