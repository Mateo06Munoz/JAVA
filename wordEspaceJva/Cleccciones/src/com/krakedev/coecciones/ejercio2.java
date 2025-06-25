package com.krakedev.coecciones;

import java.util.ArrayList;

public class ejercio2 {

	public static void main(String[] args) {
			ArrayList<Persona> personas;
			personas=new ArrayList<Persona>();
			
			personas.add(new Persona("Ana","Lopez"));
			personas.add(new Persona("Alisson","Rodriguez"));
			personas.add(new Persona("Mateo","Paredes"));
			
			System.out.println(personas.size());
			Persona elementoP;	
			for(int i=0;i<personas.size();i++) {
				elementoP=personas.get(i);
				System.out.println(elementoP.getNobre()+"-"+elementoP.getApellido());
				
				

			}
			
	}	

}
