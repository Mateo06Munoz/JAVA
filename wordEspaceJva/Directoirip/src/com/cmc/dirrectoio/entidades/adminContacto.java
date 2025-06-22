package com.cmc.dirrectoio.entidades;

public class adminContacto {
	public double buscarMasPeso(contacto c1, contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1.getPeso();
		}
		if (c2.getPeso() > c1.getPeso()) {
			return c2.getPeso();
		}
		return 0;
	}

	public static boolean compararOperaciones(contacto c1, contacto c2) {
		Telefono t1 = c1.getTelefono();
		Telefono t2 = c2.getTelefono();
		if (t1.getOperador() == t2.getOperador()) {
			return true;
		} else {
			return false;
		}

	}

	public void activarUsuario(contacto c1) {	
		Telefono t1= c1.getTelefono();

		if (t1.getTieneWhatsapp()==true) {
			c1.setAntivo(true);
		}
	}
}