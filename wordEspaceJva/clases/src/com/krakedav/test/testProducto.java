package com.krakedav.test;

import com.krakedav.Producto;

public class testProducto {

	public static void main(String[] args) {
		Producto productoA=new Producto();
		Producto productoB=new Producto();
		Producto productoC=new Producto();
		
		productoA.setNombre("paracetamol");
		productoA.setDescripcion("para curar un dolor");
		productoA.setPrecio(0.45);
		productoA.setStockAnual(100);
		
		System.out.println("nombre:"+productoA.getNombre());
		System.out.println("nombre:"+productoA.getDescripcion());
		System.out.println("nombre:"+productoA.getPrecio());
		System.out.println("nombre:"+productoA.getStockAnual());
		
		System.out.println("----------------------------------");
		productoB.setNombre("salandrius");
		productoB.setDescripcion("para el dolor de la cabeza");
		productoB.setPrecio(0.55);
		productoB.setStockAnual(150);
		
		System.out.println("nombre:"+productoB.getNombre());
		System.out.println("nombre:"+productoB.getDescripcion());
		System.out.println("nombre:"+productoB.getPrecio());
		System.out.println("nombre:"+productoB.getStockAnual());
		
		System.out.println("----------------------------------");
		productoC.setNombre("aspirina");
		productoC.setDescripcion("para el dolor de la panza");
		productoC.setPrecio(0.25);
		productoC.setStockAnual(85);
		
		System.out.println("nombre:"+productoC.getNombre());
		System.out.println("nombre:"+productoC.getDescripcion());
		System.out.println("nombre:"+productoC.getPrecio());
		System.out.println("nombre:"+productoC.getStockAnual());
		
		
		
		
	}

}
