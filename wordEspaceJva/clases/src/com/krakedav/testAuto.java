package com.krakedav;

public class testAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		
		auto1.nombre="ferari";
		auto1.anio=2000;
		auto1.precio=2000.300;
		
		System.out.println("nombre: "+auto1.nombre);
		System.out.println("nombre: "+auto1.anio);
		System.out.println("nombre: "+auto1.precio);
		
		
		auto2.nombre="Audi";
		auto2.anio=1956;
		auto2.precio=12023.345;
		
		System.out.println("---------------------");
		System.out.println("nombre: "+auto2.nombre);
		System.out.println("nombre: "+auto2.anio);
		System.out.println("nombre: "+auto2.precio);
	}

}
