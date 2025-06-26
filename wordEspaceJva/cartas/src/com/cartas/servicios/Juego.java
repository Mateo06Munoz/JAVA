package com.cartas.servicios;

import java.util.ArrayList;
import java.util.Collections;

import com.cartas.estidaes.Carta;
import com.cartas.estidaes.Naipe;
import com.cartas.estidaes.Numero;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador = new ArrayList<ArrayList<Carta>>();
	private ArrayList<Carta> naipeBarajado = new ArrayList<Carta>();

	public ArrayList<Carta> getNaipeBarajado() {
		return naipeBarajado;
	}

	public void setNaipeBarajado(ArrayList<Carta> naipeBarajado) {
		this.naipeBarajado = naipeBarajado;
	}

	public Juego(ArrayList<String> id) {

		cartasJugador = new ArrayList<ArrayList<Carta>>();
		naipe = new Naipe();

		for (int i = 0; i < id.size(); i++) {
			ArrayList<Carta> cartas = new ArrayList<Carta>();
			cartasJugador.add(cartas);

		}
		naipeBarajado = naipe.barajar();
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}

	public void setCartasJugador(ArrayList<ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}

	public void entregarCartas(int cartasPorJugador) {

		int contador = 0;

		for (int j = 0; j < cartasJugador.size(); j++) {
			ArrayList<Carta> c = cartasJugador.get(j);
			for (int m = 1; m <= cartasPorJugador; m++) {
				Carta cartaM = naipeBarajado.get(contador);
				c.add(cartaM);
				contador = contador + 1;
			}
		}
	}

	public int devolverTotal(int i) {
		int numeroT = 0;
		ArrayList<Carta> cartasJ = cartasJugador.get(i);
		Carta cartas = cartasJ.get(i);
		Numero n = cartas.getNumero();
		numeroT = numeroT + n.getValor();
		return numeroT;
	}

	public String determinarGanador() {

		ArrayList<String> nombre = new ArrayList<String>();
		nombre.add("jugador 1");
		nombre.add("jugador 2");
		nombre.add("jugador 3");
		int posicion = 0;
		int total = 0;
		ArrayList<Integer> totales = new ArrayList<Integer>();

		for (int i = 0; i < cartasJugador.size(); i++) {

			ArrayList<Carta> cartas = cartasJugador.get(i);

			for (int j = 0; j < cartas.size(); j++) {
				Carta ce = cartas.get(j);

				
				total = total + ce.getNumero().getValor();

				
			}

			totales.add(total);

			

		}
		
		int maximo = Collections.max(totales);
		 posicion = totales.indexOf(maximo);
		 posicion =posicion-1;
		return nombre.get(posicion);
	}

}
