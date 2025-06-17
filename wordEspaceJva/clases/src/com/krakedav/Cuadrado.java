package com.krakedav;

public class Cuadrado {
	int lado;
	public int areaCuadrado() {
		int resultado=lado*lado;
		return resultado;
	}
	public int perimetroCuadrado() {
		int resultado=lado*4;
		return resultado;
	}
}
