package com.krakedev.compacicion;

public class Persona {
	private String nombre;
	private String apelido;
	private Direccion direccion;
	private int edad;
	private double estatura;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public void imprimir() {
		if(direccion!=null) {
			System.out.println("nombre: " + nombre + " apellido: " + apelido + " direccion: " + direccion.getCallePricipla()
			+ " " + direccion.getNumero() + " y " + direccion.getCalleSecuntaria());
		}else {
			System.out.println("nombre: " + nombre + " apellido: " + apelido+" direccion:null " );
		}
		
	}

}
