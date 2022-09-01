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
    private String account;
    private String esn;
    private String mac; // siempre minusculas
    private String userAgent; //modelostb

    public RegisterDeviceRequest(String alias, String esn, String mac, String userAgent) {
        this.alias = alias;
        this.esn = esn;
        this.mac = mac;
        this.userAgent = userAgent;
        this.account = null;
    }
    
}
