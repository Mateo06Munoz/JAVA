package com.cmc.repaso.entidades;

public class Validacion {
	public static  boolean validarMonto(int monto) {
		if(monto>0) {
			return true; 
		}else {
			return false;
		}
	
	}
}
