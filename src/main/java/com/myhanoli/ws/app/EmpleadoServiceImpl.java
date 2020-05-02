package com.myhanoli.ws.app;

import javax.jws.WebService;

import com.myhanoli.ws.app.request.ConstraintViolationRequest;
import com.myhanoli.ws.app.request.EmpleadoRequest;
import com.myhanoli.ws.app.response.EmpleadoResponse;


@WebService(endpointInterface="com.myhanoli.ws.app.EmpleadoService")
public class EmpleadoServiceImpl implements EmpleadoService {
	
	public EmpleadoResponse getEmpleadoById(EmpleadoRequest empleado) {
		
		return new ConstraintViolationRequest().violation(empleado);
		
		/*EmpleadoResponse resp = (idEmpleado == 10)? new EmpleadoResponse.EmpleadosBuilder().codigo(100).descripcion("Se encontro empleado").build()
		: new EmpleadoResponse.EmpleadosBuilder().codigo(-1).descripcion("Error").build();

		return resp;*/
		
		/*String resp = (idEmpleado == 10 )? "Se encontro empleado":"Error";
		
		return resp;*/
		    
		}
	

}
