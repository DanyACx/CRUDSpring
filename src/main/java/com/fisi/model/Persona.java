package com.fisi.model;

public class Persona {


	private int ide;
	private String nombres;
	private String correo;
	private String nacionalidad;
	
	public Persona() {
		
	}

	public Persona(int ide, String nombres, String correo, String nacionalidad) {
		super();
		this.ide = ide;
		this.nombres = nombres;
		this.correo = correo;
		this.nacionalidad = nacionalidad;
	}

	public int getIde() {
		return ide;
	}

	public void setIde(int ide) {
		this.ide = ide;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	
}
