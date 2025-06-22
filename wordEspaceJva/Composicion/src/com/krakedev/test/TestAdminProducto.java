package com.krakedev.test;

import com.krakedev.compacicion.AdminProducto;
import com.krakedev.compacicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin=new AdminProducto();
		Producto p1=new Producto("Doritos",0.40);
		Producto p2 =new Producto("papitas",0.50);
		
		Producto mc=admin.buscraMasCaro(p1, p2);
		if(mc==null) {
			System.out.println("son igales");
		}else {
			System.out.println("el mas caro es :"+mc.getNombre());
		}
		
	}

}
