package com.totalplay.mx.middlewareregisteriptv.modelRequest;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterBundleRequest {

    @NotBlank 
    private String  account;
    private String   expiration;
    private String  session;
    @NotBlank 
    private String   tmCode;
  
    
}
