package com.clearmids.test;

import com.clearmids.componentes.Cedula;
import com.clearmids.componentes.Producto;
import com.clearmids.maquina.MaquinaDulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34",0.85,"Papitas");
		maquina.cargarProducto(producto, "B1", 4);
		
		maquina.mostrarProductos();
		
		maquina.incrementarProductos("KE34", 8);
		
		System.out.println("------------LUEGO DEL INCREMENTO-------------");
		
		maquina.mostrarProductos();
		
	}
}
