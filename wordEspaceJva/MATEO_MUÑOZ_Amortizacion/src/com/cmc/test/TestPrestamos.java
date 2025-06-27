package com.cmc.test;

import java.util.ArrayList;

import com.cmc.evaluacion.Banco;
import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Entidades;
import com.cmc.evaluacion.Prestamo;

public class TestPrestamos {
	public static void main(String[] args) {
        Banco banco = new Banco();

        Entidades cliente1 = new Entidades("1234567890", "Juan", "Perez");
        
        Entidades cliente2 = new Entidades("0987654321", "Maria", "Lopez");

        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);

        
            Prestamo prestamo1 = new Prestamo(4000,12,16);
            banco.asignarPrestamo("1234567890", prestamo1);
            CalculadoraAmortizacion.GenerarTabla(prestamo1);
            
            Prestamo prestamo2 = new Prestamo(50000,10,11);
            banco.asignarPrestamo("1234567890", prestamo2);

            Prestamo prestamo3 = new Prestamo(2000,8,14);
            banco.asignarPrestamo("0987654321", prestamo3);

            ArrayList<Prestamo> prestamosCliente1 = banco.buscarPrestamos("1234567890");
            for (Prestamo prestamo : prestamosCliente1) {
            	cliente1.mostrarClinetes();
            	prestamo.mostrarPrestamos();
            	
            }
            ArrayList<Prestamo> prestamosCliente2 = banco.buscarPrestamos("0987654321");
            for (Prestamo prestamo : prestamosCliente2) {
            cliente2.mostrarClinetes();
            prestamo.mostrarPrestamos();
            }

          
           

            
            
 
 
        }
}
