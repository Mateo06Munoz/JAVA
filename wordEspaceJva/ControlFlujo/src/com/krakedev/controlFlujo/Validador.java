package com.krakedev.controlFlujo;

public class Validador {
	public void ValidarEdad(int edad) {
		if(edad>=18) {
			System.out.println("mayor de edad");
		}else if(edad>=12&&edad<18){
			System.out.println("adolecente");
		}else if (edad>0&&edad <12) {
			System.out.println("niño");
		}else {
			System.out.println("edad incorecto");
		}
	}
}
