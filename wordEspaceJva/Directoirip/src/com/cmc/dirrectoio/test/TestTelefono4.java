package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.AdminTelefono;
import com.cmc.dirrectoio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		AdminTelefono admin=new AdminTelefono();
		Telefono t1=new Telefono("claro","0912349824",53);
		Telefono t2=new Telefono("claro","0949823109",14);
		Telefono t3=new Telefono("movi","0965439872",23);
		Telefono t4=new Telefono("movi","0979516266",56);
		
		int resultado=admin.contarclaro(t1, t2, t3,t4);
		
		
		System.out.println("numeros de movi: "+resultado);
	}

}
