package com.Krakedev.test;

import com.Krakedev.evaluacion.Contacto;
import com.Krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");

        // Settear la dirección
        Direccion Direccion = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto.setDireccion(Direccion);

        // Mostrar información 
        System.out.println("Información del Contacto:");
        contacto.imprimir();
    }
}


