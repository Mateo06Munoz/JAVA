package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.maquinaDulces;

public class TestVenderConCmbio {

	public static void main(String[] args) {
		maquinaDulces maquina=new maquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
		
		Producto producto=new Producto("Papi6tas",0.85,"KE34");
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("Doritos",0.70,"D456");
		maquina.cargarProducto(producto2, "A1", 6);
		
		double cambio=maquina.venderConCambio("B1",1);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		
	}

}
