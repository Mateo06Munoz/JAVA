package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	
	private static ArrayList<Cuota> cuotas;
	public static double calcularCuota(Prestamo prestamo) {
	double I=(prestamo.getInteres()/12)/100;
	double IpM=prestamo.getMonto()*I;
	double O=1+I;
	double P=Math.pow(O,-prestamo.getPlazo());
	double D=1-P;
	double cuota=IpM/D;
	
	return cuota;
	}
	public static void GenerarTabla(Prestamo prestamo) {
		double cc=calcularCuota(prestamo);
		Cuota cuota=new Cuota (1);
		cuota.setCuota(cc);
		cuotas=new ArrayList<Cuota>();
		cuota.setCapital(prestamo.getMonto());
		double interes =  prestamo.getMonto()* prestamo.getInteres()/1200;
		cuota.setInteres(interes);
		cuota.setAbonoCapital(cc-interes);
		cuota.setSaldo(prestamo.getMonto()-cuota.getAbonoCapital());
		
		cuotas.add(cuota);
		
		for (int i=2;i<=prestamo.getPlazo();i++) {
				
			Cuota A=cuotas.get(i-2);
			Cuota cuotaS = new Cuota(i);
			cuotaS.setCuota(A.getCuota());
			cuotaS.setCapital(A.getSaldo());
			calcularValoresCuota(prestamo.getInteres()/(1200),A,cuotaS);
			cuotas.add(cuotaS);

		}
	}
	public static void calcularValoresCuota(double interes,Cuota cuotaA,Cuota cuotaN) {
		cuotaN.setInteres(cuotaN.getCapital()*interes);
		cuotaN.setAbonoCapital(cuotaN.getCuota()-cuotaN.getInteres());
		cuotaN.setSaldo(cuotaA.getSaldo()-cuotaN.getAbonoCapital());
		
		
		
		
	}
	public static void mostrarTabla(Prestamo prestamo) {
		
		for(int i=0;i<cuotas.size();i++) {
			Cuota c=cuotas.get(i);
			c.mostrarPrestamo();
		}
	}
}
	