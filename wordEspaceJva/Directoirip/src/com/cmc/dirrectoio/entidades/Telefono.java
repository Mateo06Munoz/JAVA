package com.cmc.dirrectoio.entidades;

public class Telefono {
	private String operador;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp = false;

	public Telefono(String operador, String numero, int codigo) {
		this.operador = operador;
		this.numero = numero;
		this.codigo = codigo;

	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean getTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
}
