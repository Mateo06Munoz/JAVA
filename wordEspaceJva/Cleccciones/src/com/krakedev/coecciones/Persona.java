package com.krakedev.coecciones;

public class Persona {
	private String nobre;
	private String apellido;
	private int edad;
	
	
	public Persona(String nobre, String apellido) {
		this.nobre = nobre;
		this.apellido = apellido;
	}
	public Persona(String nobre, String apellido,int edad) {
		this.nobre = nobre;
		this.apellido = apellido;
		this.edad=edad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNobre() {
		return nobre;
	}
	public void setNobre(String nobre) {
		this.nobre = nobre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
