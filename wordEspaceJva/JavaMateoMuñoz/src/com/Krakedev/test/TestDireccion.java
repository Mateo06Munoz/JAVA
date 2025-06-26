package com.Krakedev.test;

import com.Krakedev.evaluacion.Direccion;

public class TestDireccion {
public static void main(String[] args) {
    // Crear una instancia de Direccion con un constructor
    Direccion direccion1 = new Direccion("Calle A", "Calle B");

    // Mostrar información usando los getters
    System.out.println("Calle Principal: " + direccion1.getCallePrincipla());
    System.out.println("Calle Secundaria: " + direccion1.getCalleSecundaria());

    // Modificar la información usando los setters
    direccion1.setCallePrincipla("Nueva Calle");
    direccion1.setCalleSecundaria("Otra Calle");

    // Mostrar la información actualizada
    System.out.println("Calle Principal (actualizada): " + direccion1.getCallePrincipla());
    System.out.println("Calle Secundaria (actualizada): " + direccion1.getCalleSecundaria());

}
}
