package com.totalplay.mx.middlewareregisteriptv.modelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDeviceRequest {

private String alias;
private String esn;
private String isDemo;
private String isInternal;
private String isTest;
private String mac;
    
}
