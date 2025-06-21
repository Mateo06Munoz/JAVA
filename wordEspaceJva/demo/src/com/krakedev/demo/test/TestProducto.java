package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1=new Producto(5734,"cereales");
		p1.setDescripcion("sirver para comer");
		p1.setPeso(55);
		
		System.out.println("codigo: "+p1.getCodigo());
		System.out.println("codigo: "+p1.getNombre());
		System.out.println("codigo: "+p1.getDescripcion());
		System.out.println("codigo: "+p1.getPeso());
	}

}
