package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestBuscarProductoEnCelda {
	public static void main(String[] args) {
		maquinaDulces maquina = new maquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));

		Producto productoA = new Producto("Papitas", 0.85, "KE34");
		Producto productoB = new Producto("Galletas", 2.54, "BDCR");

		maquina.cargarProducto(productoB, "D", 5);
		maquina.cargarProducto(productoA, "B", 4);
		Producto p1 = maquina.buscarProductoEnCelda("B");
		Producto p2 = maquina.buscarProductoEnCelda("F");
		
		System.out.println("Producto encontrado: " + p1.getNombre());
		
		if (p2 != null) {
			System.out.println("Producto encontrado: " + p2.getNombre());
		}else {
			System.out.println("Producto encontrado: null");
		}
	}

}
