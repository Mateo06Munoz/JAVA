package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.AdminTelefono;
import com.cmc.dirrectoio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono admin=new AdminTelefono();
		Telefono t1=new Telefono("movi","0979516266",23);
		Telefono t2=new Telefono("claro","0978036266",23);
		Telefono t3=new Telefono("movi","0979372266",23);
		
		int resultado=admin.contarMovi(t1, t2, t3);
		System.out.println("numeros de movi:"+resultado);
		
	}

}
