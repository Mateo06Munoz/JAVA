package com.krakedav;

public class testProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.nombre="paracetamol";
		productoA.descripcion="para curar un dolor";
		productoA.precio=0.45;
		productoA.stockAnual=100;
		
		System.out.println("nombre:"+productoA.nombre);
		System.out.println("nombre:"+productoA.descripcion);
		System.out.println("nombre:"+productoA.precio);
		System.out.println("nombre:"+productoA.stockAnual);
		
		System.out.println("----------------------------------");
		productoB.nombre="salandrius";
		productoB.descripcion="para el dolor de la cabeza";
		productoB.precio=0.55;
		productoB.stockAnual=150;
		
		System.out.println("nombre:"+productoB.nombre);
		System.out.println("nombre:"+productoB.descripcion);
		System.out.println("nombre:"+productoB.precio);
		System.out.println("nombre:"+productoB.stockAnual);
		
		System.out.println("----------------------------------");
		productoC.nombre="aspirina";
		productoC.descripcion="para el dolor de la panza";
		productoC.precio=0.25;
		productoC.stockAnual=85;
		
		System.out.println("nombre:"+productoC.nombre);
		System.out.println("nombre:"+productoC.descripcion);
		System.out.println("nombre:"+productoC.precio);
		System.out.println("nombre:"+productoC.stockAnual);
		
		
		
		
	}

}
