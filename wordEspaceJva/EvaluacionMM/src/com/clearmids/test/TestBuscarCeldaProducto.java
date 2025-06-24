package com.clearmids.test;

import com.clearmids.componentes.Cedula;
import com.clearmids.componentes.Producto;
import com.clearmids.maquina.MaquinaDulces;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34",0.85,"Papitas");
		maquina.cargarProducto(producto, "B1", 4);
		
		
		Cedula celda=maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda que contiene el producto:"+celda.getCodigo());
		
		
		
		
	}
}