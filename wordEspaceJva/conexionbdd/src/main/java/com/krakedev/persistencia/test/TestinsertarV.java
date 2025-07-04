package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Plataformas;
import com.krakedev.persistencia.entidades.Videojuegos;
import com.krakedev.persistencia.servicios.TestVideojuegos;

public class TestinsertarV {
	public static void main(String[] args) {

		Plataformas p = new Plataformas(1,"claro");
		Videojuegos v = new Videojuegos(22222,"luis",3567,p);
		try {
						// p.setCantidadA(new BigDecimal(1200.45));
			// p.setNumeroH(50);
			TestVideojuegos.insertar(v);
		} catch (Exception e) {
			System.out.println("error en el sisitema: " + e.getMessage());
		}

	}
}
