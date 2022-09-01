package com.totalplay.mx.middlewareregisteriptv.modelRequest;

import javax.validation.constraints.NotBlank;

public class GetModelRequest {
	@NotBlank
	private String stb ;

	GetModelRequest(){
		
	}
	
	GetModelRequest(String stb){
		this.stb = stb;
	}
	
	public String getStb() {
		return stb;
	}

	public void setStb(String stb) {
		this.stb = stb;
	}
	
	

}
