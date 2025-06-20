package com.krakedav;

public class Cuadrado {
	public int lado;
	
	public Cuadrado() {}
	public Cuadrado(int lado) {
		this.lado=lado;
	}
	public int areaCuadrado() {
		int resultado=lado*lado;
		return resultado;
	}
	public int perimetroCuadrado() {
		int resultado=lado*4;
		return resultado;
	}
}
