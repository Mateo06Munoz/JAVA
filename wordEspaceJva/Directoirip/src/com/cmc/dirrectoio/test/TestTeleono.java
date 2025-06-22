package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.Telefono;

public class TestTeleono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		System.out.println("operador: "+telf.getOperador());
		System.out.println("numero: "+telf.getNumero());
		System.out.println("codigo "+telf.getCodigo());
		
		
	}

}
