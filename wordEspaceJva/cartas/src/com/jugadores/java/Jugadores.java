package com.jugadores.java;

import java.util.ArrayList;

import com.cartas.estidaes.Carta;
import com.cartas.estidaes.Numero;
import com.cartas.servicios.Juego;

public class Jugadores {
	private ArrayList<String> nombreJugadores = new ArrayList<String>();
	private ArrayList<Integer > total = new ArrayList<Integer >();	

	public ArrayList<String> getJugadores() {
		return nombreJugadores;
	}

	public void setJugadores(ArrayList<String> nombreJugadores) {
		this.nombreJugadores = nombreJugadores;
	}

	public void jugar() {
		ArrayList<String> jugadores = new ArrayList<String>();
		jugadores.add("jugador 1");
		jugadores.add("jugador 2");
		jugadores.add("jugador 3");
		Juego juegoO = new Juego(jugadores);
		juegoO.entregarCartas(5);

		ArrayList<ArrayList<Carta>> cartasJ = juegoO.getCartasJugador();
		int totalpuntaje=0;
		for (int i = 0; i < cartasJ.size(); i++) {
			ArrayList<Carta> cartas = cartasJ.get(i);
			for(int j=0;j<cartas.size();j++) {
				Carta ce=cartas.get(j);
				Numero ne=ce.getNumero();
				totalpuntaje=totalpuntaje+ne.getValor();
				total.add(totalpuntaje);
				System.out.println("Total del jugador: "+totalpuntaje);
				
			}
			
		}

	}
}
