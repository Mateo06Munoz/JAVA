package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1=new Producto("LECHE",-1);
		Producto p2=new Producto("LECHE",-1);
		Producto p3=new Producto("cafe",50);
		
		p1.setPrecio(-6);
		p2.setPrecio(3.75);
		
		System.out.println(p1.getPrecio());
		System.out.println(p2.getPrecio());
		System.out.println("_______________________________");
		double resultado=p3.calcularPrecioPromo(0.15);
		System.out.println(resultado);

	}

}
