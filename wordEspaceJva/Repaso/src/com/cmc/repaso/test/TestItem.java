package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item I1=new Item();
		System.out.println("Valores Iniciales");
		I1.setProductosActuales(20);
		I1.imprimir();
		System.out.println("_________________________________________________________");
		
		I1.vender(4);
		I1.imprimir();
		System.out.println("_________________________________________________________");
		I1.devolver(1);
		I1.imprimir();
	}

}
