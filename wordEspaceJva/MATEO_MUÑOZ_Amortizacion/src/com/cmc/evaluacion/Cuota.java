package com.cmc.evaluacion;

public class Cuota {
	private int numero ;
	private double  cuota ;
	private double  capital ;
	private double  inicion ;
	private double  interes ;
	private double  abonoCapital ;
	private double  saldo ;
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicion() {
		return inicion;
	}
	public void setInicion(double inicion) {
		this.inicion = inicion;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void mostrarPrestamo () {

		System.out.println(numero+" | "+cuota+" | "+capital+" | "+interes+" | "+abonoCapital+" | "+saldo);
	}
	
}

