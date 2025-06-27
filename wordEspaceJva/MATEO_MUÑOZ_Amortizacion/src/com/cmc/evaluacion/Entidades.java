package com.cmc.evaluacion;

import java.util.ArrayList;

public class Entidades {
	private String cedula;
	private String nombre;
	private String apelldio;
	private ArrayList<Prestamo> pretamo =new  ArrayList<Prestamo>();
	public Entidades(String cedula, String nombre, String apelldio) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apelldio = apelldio;
	}
	
	public ArrayList<Prestamo> getPretamo() {
		return pretamo;
	}

	public void setPretamo(ArrayList<Prestamo> pretamo) {
		this.pretamo = pretamo;
	}

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelldio() {
		return apelldio;
	}
	public void setApelldio(String apelldio) {
		this.apelldio = apelldio;
	}
	public void mostrarClinetes() {
		System.out.println("cedula: "+cedula+" nombre: "+nombre+" apelldio:  "+apelldio);
	}
}
