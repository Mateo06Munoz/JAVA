package com.krakedav;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea () {
		int area= base*altura;
		return area;
	}
	public int calcularPerimetro() {
		int area=base+base+altura+altura;
		return area;
	}
}
