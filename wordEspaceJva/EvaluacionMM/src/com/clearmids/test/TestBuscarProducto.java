package com.clearmids.test;

import com.clearmids.componentes.Producto;
import com.clearmids.maquina.MaquinaDulces;

public class TestBuscarProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto productoEncontrado=maquina.buscarProductoEnCelda("B1");
		System.out.println("Producto encontrado:"+productoEncontrado.getNombre());
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod);
		
		
		
		
	}
}
