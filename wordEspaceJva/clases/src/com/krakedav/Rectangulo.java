package com.krakedav;

public class Rectangulo {
	private int base;
	private int altura;
	
	public int calcularArea () {
		int area= base*altura;
		return area;
	}
	public Rectangulo() {}
	
	public Rectangulo(int base,int altura) {
		this.base=base;
		this.altura=altura;
	}
	public int calcularPerimetro() {
		int area=base+base+altura+altura;
		return area;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
