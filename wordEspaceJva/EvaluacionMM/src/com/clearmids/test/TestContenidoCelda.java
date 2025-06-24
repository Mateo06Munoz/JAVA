package com.clearmids.test;

import com.clearmids.componentes.Cedula;
import com.clearmids.componentes.Producto;

public class TestContenidoCelda {

	public static void main(String[] args) {
		Cedula celda=new Cedula("A1");
		Producto producto=new Producto("Papitas",0.85,"KE34");
		celda.ingresarProducto(producto, 5);
		
		System.out.println("CELDA:"+celda.getCodigo());
		System.out.println("*************************************");
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
	}

}