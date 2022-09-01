package com.totalplay.mx.middlewareregisteriptv.modelRequest;

import javax.validation.constraints.NotBlank;

public class AccountModelRequest {
	
	@NotBlank
	private String account;

	public AccountModelRequest(){}

	public AccountModelRequest(String account) {
		this.account = account;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	
	

}
