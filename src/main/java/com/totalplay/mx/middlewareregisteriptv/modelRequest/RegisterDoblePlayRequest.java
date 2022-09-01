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
public class RegisterDoblePlayRequest {

    @NotBlank
    private String contract;
    @NotBlank
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String idTypeContract;
    private String isConsolidate;
    private String isMain;
    private String isMonitoring;
    private String isTest;
    @NotBlank
    private String lastName;
    @NotBlank
    private String latitude;
    @NotBlank
    private String longitude;
    private String mdnHome;
    @NotBlank
    private String name;
    @NotBlank
    private String regionId;
    @NotBlank
    private String sus_sty_id;
    @NotBlank
    private String zone;
    @NotBlank
    private String zipCode;

    public RegisterDoblePlayRequest(String contract,String email,String firstName,
           String idTypeContract,String lastName, String latitude,
            String longitude,String name,  String regionId, String sus_sty_id,
            String zone, String zipCode) {
        this.contract = contract;
        this.email = email;
        this.firstName = firstName;
        this.idTypeContract = idTypeContract;
        this.lastName = lastName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.regionId = regionId;
        this.sus_sty_id = sus_sty_id;
        this.zone = zone;
        this.zipCode = zipCode;
    }

}
