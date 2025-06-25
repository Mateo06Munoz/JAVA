package com.krakedev.coecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas adm=new AdminPersonas();
		adm.agregar(new  Persona ("Mario","benedeti",50));
		adm.agregar(new  Persona ("Ana","Lopez",17));
		adm.agregar(new  Persona ("Alisson","Rodriguez",16));
		adm.imprimir();
		Persona p1=adm.buscarPorNombre("Ana");
		if(p1!=null) {
			System.out.println("ENCONTRADO: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("no exixte la persona con el nombre Jose");
		}
		ArrayList<Persona> pm= adm.buscarMayores(15);
		System.out.println("mayores: "+pm.size()) 	;
		
	
	}

}
