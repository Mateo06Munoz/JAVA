package com.krakedav.test;

import com.krakedav.Rectangulo;

public class testRctangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		Rectangulo r3=new Rectangulo(10,5);
		
		int AreaR3=r3.calcularArea();
		System.out.println("Area de r3: "+AreaR3);
		
		r1.setBase(10);
		r1.setAltura(5);
		
		r2.setBase(8);
		r2.setAltura(3);
		
		int AreaR1=r1.calcularArea();
		int AreaR2=r2.calcularArea();
		System.out.println("Area de r1: "+AreaR1);
		System.out.println("Area de r1: "+AreaR2);
		
		
		int areaPerimetro=r1.calcularPerimetro();
		System.out.println("Area perimetro: "+areaPerimetro);
	}

}	
