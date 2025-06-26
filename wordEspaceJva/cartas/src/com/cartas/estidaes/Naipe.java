package com.cartas.estidaes;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles = new ArrayList<Numero>();
	private ArrayList<Carta> cartas = new ArrayList<Carta>();

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public Naipe() {
		Palos palo = new Palos();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		for (int i = 0; i < numerosPosibles.size(); i++) {
			Numero carta = numerosPosibles.get(i);
			
			Carta carta1 = new Carta(carta, palo.getCorazonRojo());
			Carta carta2 = new Carta(carta, palo.getCorazonRojo());
			Carta carta3 = new Carta(carta, palo.getDiamante());
			Carta carta4 = new Carta(carta, palo.getTrebol());
			cartas.add(carta1);
			cartas.add(carta2);
			cartas.add(carta3);
			cartas.add(carta4);
			

		}
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> cartasBarajeado = new ArrayList<Carta>();

		for (int i = 0; i <= 100; i++) {
			int random = (int) Random.obtenerPosicion();
			Carta ce = cartas.get(random);
			if ("N".equals(ce.getEstado())) {
				ce.setEstado("C");
				cartasBarajeado.add(ce);
			}
		}
		for (int i = 0; i < cartas.size(); i++) {
			Carta ce = cartas.get(i);

			if ("N".equals(ce.getEstado())) {
				cartasBarajeado.add(ce);
			}
		}
		return cartasBarajeado;

	}
}
