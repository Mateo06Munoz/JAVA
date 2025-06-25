package com.krakedev.coecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;

	public AdminPersonas() {
		personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		personas.add(persona);
	}

	public void imprimir() {
		Persona ep;
		for (int i = 0; i < personas.size(); i++) {
			ep = personas.get(i);
			System.out.println("Persona: " + ep.getNobre() + " " + ep.getEdad());
		}
	}

	public Persona buscarPorNombre(String nombre) {
		Persona personaE = null;
		Persona ep = null;
		for (int i = 0; i < personas.size(); i++) {
			ep = personas.get(i);
			if (nombre.equals(ep.getNobre())) {
				 personaE=ep;
			}
		}
		return personaE;
	}
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores=new ArrayList<Persona>();
		Persona ep=null;
		for(int i=0;i<personas.size();i++) {
			ep=personas.get(i);
			if(ep.getEdad()>edad) {
				mayores.add(ep);
			}
		}
		
		return mayores;
	} 
}
