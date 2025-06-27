package com.cmc.test;

import com.cmc.evaluacion.Banco;
import com.cmc.evaluacion.Entidades;

public class TestCliente {
	 public static void main(String[] args) {
	        Banco banco = new Banco();
	        Entidades cliente1 = new Entidades("1234567890", "Juan", "Perez");
	            banco.registrarCliente(cliente1);
	            cliente1.mostrarClinetes();

	            Entidades cliente2 = new Entidades("0987654321", "Maria", "Lopez");
	            banco.registrarCliente(cliente2);
	           cliente2.mostrarClinetes();

	           

	          //  Intentar registrar un cliente duplicado
	           Entidades cliente3 = new Entidades("1234567890", "Pedro", "Gomez");
	            banco.registrarCliente(cliente3);
	            
	            
	        }
}
