package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		maquinaDulces maquina=new maquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
		maquina.agregarCelda(new Celda("A2"));
		maquina.agregarCelda(new Celda("B1"));
		maquina.agregarCelda(new Celda("B2"));
		
		Producto producto=new Producto("Papitas",0.85,"KE34");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("Doritos",0.70,"D456");
		maquina.cargarProducto(producto2, "A1", 6);
		
		maquina.vender("A1");
		maquina.vender("B1");
		
		maquina.mostrarProductos();

	}

}
