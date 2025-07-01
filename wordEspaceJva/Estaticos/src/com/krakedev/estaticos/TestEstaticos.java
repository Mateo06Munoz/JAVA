package com.krakedev.estaticos;

public class TestEstaticos {
	public static void main(String[] args) {
		//para invocar un metod estatico, se lo hace directamente
		// desde la clase ,No hace falta instanciar un objeto
		double numero=Math.random();
		System.out.println(numero);
		
		double radio=10;
		double area=Math.PI*radio;
		System.out.println(area);
		
		}
}
