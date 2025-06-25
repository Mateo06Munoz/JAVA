package com.krakedev.coecciones;

import java.util.ArrayList;

public class ejercicion1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		cadenas =new ArrayList<String>();
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno");//0
		cadenas.add("dos");//1
		System.out.println(cadenas.size());
		
		String valorReCuperado=cadenas.get(1);
		System.out.println(valorReCuperado);
		
		String cadena;
		for(int i=0;i<cadenas.size();i++	) {
			cadena=cadenas.get(i);
			System.out.println("cadena: "+cadena);
		}
	}

}
