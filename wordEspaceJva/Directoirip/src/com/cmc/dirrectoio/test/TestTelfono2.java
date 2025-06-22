package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.AdminTelefono;
import com.cmc.dirrectoio.entidades.Telefono;

public class TestTelfono2 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","098234234",20);
		AdminTelefono at=new AdminTelefono();
		at.activarMensajeria(telf);
		System.out.println("operador: "+telf.getOperador());
		System.out.println("numero: "+telf.getNumero());
		System.out.println("codigo "+telf.getCodigo());
		System.out.println("codigo "+telf.getTieneWhatsapp());
	}

}
