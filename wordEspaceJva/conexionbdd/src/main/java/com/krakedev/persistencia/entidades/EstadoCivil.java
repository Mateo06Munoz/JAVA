package com.krakedev.persistencia.entidades;

public class EstadoCivil {
	private String  codigo;
	private String Descripcion;
	public EstadoCivil() {}
	public EstadoCivil(String codigo, String descripcion) {
		super();
		this.codigo = codigo;
		Descripcion = descripcion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "EstadoCivil [codigo=" + codigo + ", Descripcion=" + Descripcion + "]";
	}
	
	
}
