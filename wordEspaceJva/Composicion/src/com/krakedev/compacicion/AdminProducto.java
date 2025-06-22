package com.krakedev.compacicion;

public class AdminProducto {
	// recibe 2 productos
	//retorna el producto de mayor precio
	//si tiene el mismo precio retorna null
	public  Producto buscraMasCaro(Producto p1,Producto p2) {
		if(p1.getPrecio()>p2.getPrecio()) {
			return p1;
		}else if(p2.getPrecio()>p1.getPrecio()) {
			return p2;
		}else {
			return null;
		}
	}
}
