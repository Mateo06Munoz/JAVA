 package com.krakedav.test;

import com.krakedav.Personas;

/*
 * comentario de varias lineas 
 * */
public class TestPersona {
	
	public static void main(String[] args) {
		Personas p;//1. Declaro una variable llamada p de tipo  persona 
		Personas p2 =new Personas();
		Personas p3=new Personas ("bolivar");
		Personas p4=new Personas ("bolivar",17,1.72);
		
		System.out.println("nombre: "+p4.getNombre());
		System.out.println("edad: "+p4.getEdadPersonas());
		System.out.println("estatura: "+p4.getEstatura());
		p=new Personas();//2 .instanciar un objeto Persona, referenciarlo con p 
		//3 .acedo a los atributos 
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdadPersonas());
		System.out.println("estatura: "+p.getEstatura());
		//4 .modificar los atributos
		p.setNombre("Mario");
		p.setEdadPersonas(45);
		p.setEstatura(1.56);
		//5 .acedo a los atributos 
		System.out.println("_______________________");
		System.out.println("nombre: "+p.getNombre());
		System.out.println("edad: "+p.getEdadPersonas());
		System.out.println("estatura: "+p.getEstatura());
		
		p2.setNombre("Angelina");
		System.out.println("*************");
		System.out.println("p.nombre: "+p.getNombre());
		System.out.println("p2.nombre: "+p2.getNombre());
		
		
	}

}
