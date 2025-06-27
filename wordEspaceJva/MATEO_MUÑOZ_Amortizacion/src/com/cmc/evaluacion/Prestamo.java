package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuota;
	
	
	public Prestamo(double monto, double interes, int plazo) {
		cuota =new ArrayList<Cuota> ();
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
	}
	

	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getPlazo() {
		return plazo;
	}
	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}
	public void mostrarPrestamos () {
		System.out.println("monto: "+monto+" interes: "+interes+" plazo: "+plazo);
	}
	
}


