package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.Telefono;
import com.cmc.dirrectoio.entidades.adminContacto;
import com.cmc.dirrectoio.entidades.contacto;

public class TestContatos1 {

	public static void main(String[] args) {
		adminContacto ad1=new adminContacto();
		Telefono t1=new Telefono("movi","0979130119",34);
		contacto c1=new contacto ("Rodriguez",t1,60);
		
		Telefono t2=new Telefono("movi","0979165119",56);
		contacto c2=new contacto ("Lugmaña",t2,76);
		
		double mp=ad1.buscarMasPeso(c1, c2);
		System.out.println("persona con mas peso: "+mp);
		
		boolean co=ad1.compararOperaciones(c1, c2);
		System.out.println("operadores: "+co);
	}

}
