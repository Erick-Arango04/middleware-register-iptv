package com.totalplay.mx.middlewareregisteriptv.modelRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDoblePlayRequest {

    private String contract;
    private String email;
    private String firstName;
    private int idTypeContract;
    private String isConsolidate;
    private String isMain;
    private String isMonitoring;
    private String isTest;
    private String lastName;
    private String latitude;
    private String longitude;
    private String mdnHome;
    private String name;
    private int regionId;
    private int sus_sty_id;
    private String zone; 
    private String zipCode;
}
