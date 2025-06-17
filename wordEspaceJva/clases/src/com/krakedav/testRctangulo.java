package com.krakedav;

public class testRctangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		int AreaR1=r1.calcularArea();
		int AreaR2=r2.calcularArea();
		System.out.println("Area de r1: "+AreaR1);
		System.out.println("Area de r1: "+AreaR2);
		
		
		int areaPerimetro=r1.calcularPerimetro();
		System.out.println("Area perimetro: "+areaPerimetro);
	}

}	
