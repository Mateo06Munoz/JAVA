package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metodo1() {
		String a = null;
		a.substring(0);
		// NPE Unchecked
	}

	public void metodo2() {
		File f = new File("aschivo1.txt");
		try {
		f.createNewFile(); // IOException - CHECKED
		}catch(IOException io) {
			System.out.println("error");
		}
	}

	public void metodo3() throws IOException{
		File f = new File("aschivo1.txt");
		f.createNewFile(); // IOException - CHECKED
	}
	
	
	//esta con el try y el catch
	public void metodo4() {
		try {
			metodo3();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
