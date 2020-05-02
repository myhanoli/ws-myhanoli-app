package com.myhanoli.ws.app.request;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.Validator;

import com.myhanoli.ws.app.response.EmpleadoResponse;

public class ConstraintViolationRequest {
	
	public EmpleadoResponse violation(EmpleadoRequest empleado){
		
	    int cod = 0;
	    String msg = "";
		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		
		Set<ConstraintViolation<EmpleadoRequest>> violations = validator.validate(empleado);
		
		if(violations != null && !violations.isEmpty()){
			for (ConstraintViolation<EmpleadoRequest> constraintViolation : violations) {
				list.add(constraintViolation.getMessage());
			}
		}
		
		
		if(list.size() > 0){
			
			for (String data : list) {
				
				if(data !=null){
					cod = -1;
					msg = "Ocurrio un error";
					sb.append(data).append("|");
				}
				
			}
			
		}else{
			
			cod = 100;
			msg = "Exito";
		}
	
	
		return new EmpleadoResponse.EmpleadosBuilder().codigo(cod).descripcion(msg).mensaje(sb.toString()).build();
		
		
	}

}
