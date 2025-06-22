package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.Telefono;
import com.cmc.dirrectoio.entidades.adminContacto;
import com.cmc.dirrectoio.entidades.contacto;

public class TestContactos2 {

	public static void main(String[] args) {adminContacto ad1=new adminContacto();
	Telefono t1=new Telefono("claro","0978830119",27);
	contacto c1=new contacto ("Muñoz",t1,60);
	
	Telefono t2=new Telefono("movi","0975565119",56);
	contacto c2=new contacto ("Lema",t2,76);
	
	double mp=ad1.buscarMasPeso(c1, c2);
	System.out.println("persona con mas peso: "+mp);
	
	boolean co=ad1.compararOperaciones(c1, c2);
	System.out.println("operadores: "+co);

	}

}
