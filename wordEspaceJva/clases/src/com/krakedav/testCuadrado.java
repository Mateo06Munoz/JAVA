package com.krakedav;

public class testCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		Cuadrado c4=new Cuadrado(7);
		c1.lado=4;
		c2.lado=3;
		c3.lado=6;
		
		int resultadoC1=c1.areaCuadrado();
		int resultadoC2=c2.areaCuadrado();
		int resultadoC3=c3.areaCuadrado();
		int resultadoC0=c4.areaCuadrado();

		System.out.println("area c0: "+ resultadoC0);
		System.out.println("area c1: "+ resultadoC1);
		System.out.println("area c2: "+ resultadoC2);
		System.out.println("area c3: "+ resultadoC3);
		
		
		int resultadoC4=c1.perimetroCuadrado();
		int resultadoC5=c2.perimetroCuadrado();
		int resultadoC6=c3.perimetroCuadrado();

		System.out.println("---------------------");
		System.out.println("perimero c4: "+ resultadoC4);
		System.out.println("perimetro c5: "+ resultadoC5);
		System.out.println("perimetro c6: "+ resultadoC6);
	}

}
