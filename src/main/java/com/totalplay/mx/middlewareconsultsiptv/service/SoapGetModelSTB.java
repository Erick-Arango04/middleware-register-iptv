package com.totalplay.mx.middlewareconsultsiptv.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;


@Service
public class SoapGetModelSTB implements GetConsultResponse {
	
	
	@Override
	public String getResponse(String stb) {
	String modelo = stb.substring(0, 3); 
		
		String resultModel = getModel(modelo);
		
		if (resultModel == null){
		
			modelo = stb.substring(0, 4);
			resultModel = getModel(modelo);
			
			if (resultModel == null) 
				return "Modelo no existente";
			else 
				return resultModel;
		} 
		
		
		return resultModel;
	}
		
	
	
	private String getModel(String model){
		
		Map<String, String> models = new HashMap<String, String>();
		models.put("M35", "M350");
		models.put("M38", "M384");
		models.put("780M", "N7850");
		models.put("M36", "M362");
		models.put("M37", "M370");
		models.put("V39", "M394");
		models.put("M3V", "M377");
		
		
		return models.get(model);
	}

	

}
