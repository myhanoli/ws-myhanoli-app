package com.myhanoli.ws.app.request;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class EmpleadoRequest {
	
	@NotNull
	private int idEmpleado;
	
	@Size(min=1,max=5,message="No cumple la condicion de total de caracteres")
	private String name;
	@Min(value=18,message="Edad no puede ser menor de 18 años")
	@Max(value=50,message="Edad no puede ser mayor de 50 años")
	private int edad;

	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
