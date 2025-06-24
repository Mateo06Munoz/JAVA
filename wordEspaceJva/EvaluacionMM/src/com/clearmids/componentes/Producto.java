package com.clearmids.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	public Producto(String nombre, double precio, String codigo) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public void incrementarPrecio(int porcentaje) {
		double d=porcentaje*0.01;
		double pd=d *precio;
		precio=precio +pd;
	}
	public void disminuirPrecio(double porcentaje) {
		precio=precio -porcentaje;
	}
}
