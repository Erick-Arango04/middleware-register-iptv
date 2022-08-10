package com.totalplay.mx.middlewareregisteriptv.modelRequest;

public class GetModelRequest {
	
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
