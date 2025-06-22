package com.cmc.dirrectoio.entidades;

public class AdminTelefono {
	public void  activarMensajeria(Telefono t1) {
		if(t1.getOperador()=="movi") {
			t1.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono t1,Telefono t2,Telefono t3) {
		int numero = 0;
		if(t1.getOperador()=="movi") {
			numero=numero+1;
		}
		if(t2.getOperador()=="movi") {
			numero=numero+1;
		}
		if(t3.getOperador()=="movi") {
			numero=numero+1;
		}
		return numero;
	}
	public int contarclaro(Telefono t1,Telefono t2,Telefono t3,Telefono t4) {
		int numero = 0;
		if(t1.getOperador()=="claro") {
			numero=numero+1;
		}
		if(t2.getOperador()=="claro") {
			numero=numero+1;
		}
		if(t3.getOperador()=="claro") {
			numero=numero+1;
		}
		if(t4.getOperador()=="claro") {
			numero=numero+1;
		}
		return numero;
	}
}
