package com.krakedav.test;

import com.krakedav.Auto;

public class testAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		Auto auto3=new Auto("audi",1915,2000000);
		
		System.out.println("nombre: "+auto3.getNombre());
		System.out.println("nombre: "+auto3.getAnio());
		System.out.println("nombre: "+auto3.getPrecio());
		
		
		auto1.setNombre("ferari");
		auto1.setAnio(2000);
		auto1.setPrecio(2000.300);
		
		System.out.println("nombre: "+auto1.getNombre());
		System.out.println("nombre: "+auto1.getAnio());
		System.out.println("nombre: "+auto1.getPrecio());
		
		
		auto2.setNombre("Audi");
		auto2.setAnio(1956);
		auto2.setPrecio(12023.345);
		
		System.out.println("---------------------");
		System.out.println("nombre: "+auto2.getNombre());
		System.out.println("nombre: "+auto2.getAnio());
		System.out.println("nombre: "+auto2.getPrecio());
	}

}
