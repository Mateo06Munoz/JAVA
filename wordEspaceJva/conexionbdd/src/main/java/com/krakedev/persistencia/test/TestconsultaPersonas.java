package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestconsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<persona> personas=AdminPersonas.buscarPorNombre("a");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
