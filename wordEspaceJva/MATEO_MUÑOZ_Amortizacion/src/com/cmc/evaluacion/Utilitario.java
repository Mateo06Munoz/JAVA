package com.cmc.evaluacion;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Utilitario {
	public double redondear(double valor) {
		BigDecimal redondeado = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
        double r = redondeado.doubleValue();
		
		return r;

	} 
}
