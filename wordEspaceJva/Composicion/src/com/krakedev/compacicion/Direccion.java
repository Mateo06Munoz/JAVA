package com.krakedev.compacicion;

public class Direccion {
	private String callePricipla;
	private String calleSecuntaria;
	private String numero;
	private double latitud;
	private double longitud;
	public Direccion() {}
	
	public Direccion(String callePricipla, String calleSecuntaria, String numero) {
		this.callePricipla = callePricipla;
		this.calleSecuntaria = calleSecuntaria;
		this.numero = numero;
	}
	public String getCallePricipla() {
		return callePricipla;
	}
	public void setCallePricipla(String callePricipla) {
		this.callePricipla = callePricipla;
	}
	public String getCalleSecuntaria() {
		return calleSecuntaria;
	}
	public void setCalleSecuntaria(String calleSecuntaria) {
		this.calleSecuntaria = calleSecuntaria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
}
