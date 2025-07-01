package com.krakedev.estaticos;

public class Calculos {
	//final hace que en valor no se pueda combira,es decir se convierte en una variable constante
	private final double IVA= 12;

	public double calcularIva(double monto) {
		double resultado = monto * IVA / 100;
		return resultado;
	}
}
