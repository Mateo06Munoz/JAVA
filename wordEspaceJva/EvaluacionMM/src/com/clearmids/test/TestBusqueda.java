package com.clearmids.test;

import com.clearmids.componentes.Cedula;
import com.clearmids.maquina.MaquinaDulces;

public class TestBusqueda {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		Cedula celda=maquina.buscarCelda("A2");
		System.out.println("Celda Encontrada: "+celda.getCodigo());
		Cedula celda2=maquina.buscarCelda("A3");
		if(celda2==null){
			System.out.println("no existe la celda");
		}
	}

}
