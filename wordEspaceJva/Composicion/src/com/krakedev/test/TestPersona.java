package com.krakedev.test;

import com.krakedev.compacicion.Direccion;
import com.krakedev.compacicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1=new Persona ();
		p1.setNombre("Ramiro");
		p1.setApelido("Menes");
		Direccion dir=new Direccion();
		dir.setCallePricipla("Av siempre viva");
		dir.setCalleSecuntaria("la que cruza");
		dir.setNumero("n-47");
		p1.setDireccion(dir);
		
		String nombre=p1.getNombre();
		Direccion d1=p1.getDireccion(); 
		
		System.out.println("nombre: "+nombre);
		//d1 esta null, y trato de invocar a un metodo con esa variable
		System.out.println(d1.getCallePricipla());
		
		p1.imprimir();
		Persona p2=new Persona();
		Direccion d2=new Direccion("Av Shiris","Eloy Alfaro","S/N");
		p2.setDireccion(d2);
		p2.setNombre("Ana");
		p2.imprimir();
		//nul.algunMetodo();
		System.out.println("Fin");		

		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xx","yy","123"));
		p3.imprimir();
	}

}
