package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.Telefono;
import com.cmc.dirrectoio.entidades.contacto;

public class TestContacto {

	public static void main(String[] args) {
		Telefono telf =new Telefono("movi","0979516266", 34);
		contacto c=new contacto("Rodriguez",telf,1.56);
		
		System.out.println("apelloido: "+c.getApellido());
		System.out.println("peso: "+c.getPeso());
		
		System.out.println("Operadon: "+telf.getOperador());
		System.out.println("Numeor: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());
	}

}
