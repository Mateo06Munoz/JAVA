package com.krakedev.herencia;

public class TestPersona {
	public static void main(String[] args) {
		Persona p=new Persona("1727047720","Natalia");
		
		System.out.println("hola");	
		System.out.println(p);//p.toString 
		System.out.println(p.toString());
		
		Cuenta c=new Cuenta ("5730938", 470);
		System.out.println(c.toString());
	}
}
