package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validar1=new Validacion();
		validar1.validarMonto(0);
		validar1.validarMonto(100);

	}

}
