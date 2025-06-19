package com.krakedav;

public class Personas {
	private String nombre;
	private int edadPersonas;
	private double estatura;
	
	public Personas () {
	}
	
	public Personas(String nombre) {
		this.nombre=nombre;
	}
	public Personas(String nombre,int edad,double estatura) {
		this.nombre=nombre;
		this.edadPersonas=edad;
		this.estatura=estatura;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadPersonas() {
		return edadPersonas;
	}
	public void setEdadPersonas(int edadPersonas) {
		this.edadPersonas = edadPersonas;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	
}
