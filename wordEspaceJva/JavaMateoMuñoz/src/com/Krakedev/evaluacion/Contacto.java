package com.Krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos=new ArrayList<Telefono>();

	public Contacto() {
		telefonos = new ArrayList<Telefono>();
	}

	public Contacto(String cedula, String nombre, String apellido) {
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		System.out.println("Informacion del contacto:");
		System.out.println("cedula: "+cedula);
		System.out.println("nombre: "+nombre+" "+apellido);
		System.out.println("direccion: ");
		if(direccion!=null) {
			System.out.println("  calle principal: "+direccion.getCallePrincipla());
			System.out.println("  calle sesundaria: "+direccion.getCalleSecundaria());
		}
	}
	public void imprimir1() {
		System.out.println("***" + nombre + apellido + "***");
		if (direccion != null) {
			System.out.println(direccion.getCallePrincipla() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("no tiene asociadad una direccion");
		}
	}



	public void agregarTelefono(Telefono telefonoN) {
		telefonos.add(telefonoN);
	}

	public void mostrarTelefonos() {
		Telefono E;
		System.out.println("Telefonos con estado 'C'");
		for (int i = 0; i < telefonos.size(); i++) {
			E = telefonos.get(i);
			if (E.getEstado() == "C") {
				System.out.println("Numero: " + E.getNumero() + ", Tipo: " + E.getTipo());
			} else {
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> tn =new ArrayList<Telefono>();
		Telefono te=null;
		int numeroI=0;
		for (int i = 0; i < telefonos.size(); i++) {
			te=telefonos.get(i);
			if(te.getEstado()=="E") {
				numeroI=numeroI+1;
				tn.add(te);
			}
		}
		return tn;
	}
}
