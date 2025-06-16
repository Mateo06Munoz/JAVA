package com.krakedav;

public class tetsCalculadora {

	public static void main(String[] args) {
		calculadora calcu=new calculadora();
		int resultadoSuma;
		double resultadoResta;
		double respuestaM;
		double respuestaD;
		double respuestaP;
		resultadoSuma=calcu.sumar(5,3);
		System.out.println("resultado suma: "+resultadoSuma);
		
		resultadoResta=calcu.restar(10,3);
		System.out.println("resultado resta: "+resultadoResta);
		
		respuestaM=calcu.multiplicar(5, 7);
		System.out.println(respuestaM);
		
		respuestaD=calcu.dividir(10, 5);
		System.out.println(respuestaD);
		
		respuestaP=calcu.promediar(10, 5,7);
		System.out.println(respuestaP);
		
		calcu.mostarResultado();
		
		

	}

}
