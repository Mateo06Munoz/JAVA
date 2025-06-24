package com.clearmids.test;

import com.clearmids.componentes.Cedula;

public class TestCelda {
	public static void main(String[] args) {
		Cedula celda=new Cedula("A1");
		// el nullPointeExeption se encuentra en la lineaa 10
		//la varible celda.getProducto
		System.out.println(celda.getProducto().getNombre());
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:"+celda.getProducto().getCodigo());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}
