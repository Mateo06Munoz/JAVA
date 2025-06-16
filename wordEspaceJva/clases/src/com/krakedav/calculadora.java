package com.krakedav;

public class calculadora {
	public int sumar(int valor1,int valor2) {
		int resultado;//declarar la variable 
		resultado=valor1+valor2;
		return resultado; 
	}
	public double restar(int valor1,int valor2) {
		double resultado;
		resultado=valor1-valor2;	
		return resultado;
	}
	public double multiplicar(int v1,int v2) {
		int resultado;
		resultado=v1+v2;
		return resultado;
	}
	public double dividir(int v1, int v2){
		int resultado=v1/v2;
		return resultado;
	}
	public double promediar(int v1, int v2,int v3){
		int resultado=(v1+v2+v3)/3;
		return resultado;
	}
	
}
