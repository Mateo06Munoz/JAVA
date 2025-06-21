package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosvendidos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public int getProductosvendidos() {
		return productosvendidos;
	}
	public void setProductosvendidos(int productosvendidos) {
		this.productosvendidos = productosvendidos;
	}
	
	public void imprimir() {
		System.out.println("Productos Actulles: "+productosActuales);
		System.out.println("Productos Deuletos: "+productosDevueltos);
		System.out.println("Productos Vendidos: "+productosvendidos);
	}
	public void vender (int productosvendidos) {
		productosActuales=productosActuales-productosvendidos;
		this.productosvendidos=this.productosvendidos+productosvendidos;
	}
	public void devolver (int productosvendidos) {
		this.productosActuales=productosActuales+productosvendidos;
		this.productosvendidos=this.productosvendidos-productosvendidos;
		this.productosDevueltos=productosDevueltos+productosvendidos;
	}
}
