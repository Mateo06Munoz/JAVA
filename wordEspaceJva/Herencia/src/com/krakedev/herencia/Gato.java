package com.krakedev.herencia;

public class Gato extends Animal{
	public void dormir() {
		System.out.println("el gato esta durmiendo");
	}
	public void maullar() {
		System.out.println("gato maullando");
	}
	public void maullar(String adjetivo) {
		System.out.println("gato "+adjetivo+" maullando");
	}
}
