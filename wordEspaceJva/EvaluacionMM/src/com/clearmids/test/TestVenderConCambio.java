package com.clearmids.test;

import com.clearmids.componentes.Producto;
import com.clearmids.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34",0.85,"Papitas");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456",0.70,"Doritos");
		maquina.cargarProducto(producto2, "A1", 6);
		
		maquina.vender("B1");
		double cambio=maquina.venderConCambio("B1",1);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		
	}

}