package com.cmc.dirrectoio.test;

import com.cmc.dirrectoio.entidades.Telefono;
import com.cmc.dirrectoio.entidades.adminContacto;
import com.cmc.dirrectoio.entidades.contacto;

public class TestActivo {

	public static void main(String[] args) {
		Telefono t1 =new Telefono("claro","094444346789",35);
		t1.setTieneWhatsapp(false);
		contacto c1=new contacto("Rodriguez",t1,56);
		
		adminContacto ad1=new adminContacto();
		ad1.activarUsuario(c1);
	}

}
