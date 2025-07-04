package com.krakedev.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejeccicio3 {
	private static final Logger LOGGER=LogManager.getLogger(Ejeccicio3.class);

	public void metod1() {
		String a=null;
		try {
		a.substring(0);
		}catch(Exception io) {
			System.out.println("error");
			LOGGER.error("error  al obtener la subcadena",io);
		}
	}
	public static void main(String[] args) {
		Ejeccicio3 j3= new Ejeccicio3();
		j3.metod1();
		
	}
}
