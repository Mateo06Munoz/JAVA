package com.clearmids.componentes;

public class Cedula {
	private Producto producto;
	private int Stock;
	private String codigo;
	
	public Cedula(String codigo) {
		this.codigo = codigo;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this. producto = producto;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void ingresarProducto(Producto producto,int Stock) {
		this.producto=producto;
		this.Stock=Stock;
	}
	
}
