package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudainte {

	public static void main(String[] args) {
		Estudiante e1=new Estudiante("Ana");
		Estudiante e2=new Estudiante("Alisson");
		e1.setNota(8);
		e2.setNota(7);
		e1.calificar();
		e2.calificar();
		
		System.out.println("nota de Ana: "+e1.getResultado());
		System.out.println("nota de Alisson: "+e2.getResultado());
		

	}
}
