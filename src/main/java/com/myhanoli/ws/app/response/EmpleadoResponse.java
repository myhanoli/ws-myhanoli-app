package com.myhanoli.ws.app.response;

import java.io.Serializable;


public class EmpleadoResponse implements Serializable{

	private static final long serialVersionUID = 1L;

	private int codigo;
	private String descripcion;
	private String mensaje;
	
	public EmpleadoResponse() {}
		
	public EmpleadoResponse(int codigo, String descripcion, String mensaje) {
		
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.mensaje = mensaje;
	}


	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}




	public static class EmpleadosBuilder{

		private int codigo;
		private String descripcion;
		private String mensaje;
		
		public EmpleadosBuilder() {}

		public EmpleadosBuilder codigo(int codigo){
			this.codigo = codigo;
			return this;
		}
		
		public EmpleadosBuilder descripcion(String descripcion){
			this.descripcion = descripcion;
			return this;
		}
		
		public EmpleadosBuilder mensaje(String empleadoRequest){
			this.mensaje = empleadoRequest;
			return this;
		}
		
		public EmpleadoResponse build(){
			EmpleadoResponse resp = new EmpleadoResponse();
			resp.codigo = this.codigo;
			resp.descripcion = this.descripcion;
			resp.mensaje = this.mensaje;
			return resp;
		}

	
		
		
		
	}
	
	

}
