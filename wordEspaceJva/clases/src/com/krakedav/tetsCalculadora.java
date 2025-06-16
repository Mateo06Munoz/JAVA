package com.krakedav;

public class tetsCalculadora {

	public static void main(String[] args) {
		calculadora calcu=new calculadora();
		int resultadoSuma;
		double resultadoResta;
		resultadoSuma=calcu.sumar(5,3);
		System.out.println("resultado suma: "+resultadoSuma);
		
		resultadoResta=calcu.restar(10,3);
		System.out.println("resultado resta: "+resultadoResta);
		

	}

}
