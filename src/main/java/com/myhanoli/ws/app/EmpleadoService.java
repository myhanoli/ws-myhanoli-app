package com.myhanoli.ws.app;

import javax.jws.WebService;

import com.myhanoli.ws.app.response.EmpleadoResponse;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebParam;




@WebService
public interface EmpleadoService {
	
	@WebMethod(operationName="getEmpleado")
	@WebResult(name="ResultadoOperacion") EmpleadoResponse getEmpleadoById(@WebParam(name="idEmpleado") int idEmpleado);
	
}
