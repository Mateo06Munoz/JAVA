package com.clearmids.test;

import com.clearmids.maquina.MaquinaDulces;

public class TestConfiguracion {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		maquina.mostrarConfiguracion();

	}

}
