package com.Krakedev.evaluacion;

public class Direccion {
	private String callePrincipla;
	private String calleSecundaria;
	
	public Direccion(String callePrincipla, String calleSecundaria) {
		this.callePrincipla = callePrincipla;
		this.calleSecundaria = calleSecundaria;
	}
	public String getCallePrincipla() {
		return callePrincipla;
	}
	public void setCallePrincipla(String callePrincipla) {
		this.callePrincipla = callePrincipla;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
}
