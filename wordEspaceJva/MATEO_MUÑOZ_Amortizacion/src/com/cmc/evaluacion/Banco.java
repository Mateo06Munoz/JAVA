package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Entidades> clientes = new ArrayList<Entidades>();

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Entidades> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Entidades> clientes) {
		this.clientes = clientes;
	}

	public Entidades buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Entidades C = clientes.get(i);
			if (cedula.equals(C.getCedula())) {
				return C;
			} 
		}
		return null;
	}

	public void registrarCliente(Entidades cliente) {

		Entidades clienteE = buscarCliente(cliente.getCedula());
		if (clienteE != null) {
			clientes.add(clienteE);
		} else {
			System.out.println("Cliente ya Exxiste " + cliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		ArrayList<Prestamo> Prestamos = new ArrayList<Prestamo>();
		Entidades c = buscarCliente(cedula);
		if (c == null) {
			System.out.println("no es un cliente del baco");
		} else {
			c.getPretamo().add(prestamo);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Entidades c=buscarCliente(cedula);
		Prestamo pe=null;
		if(c!=null) {
			ArrayList<Prestamo> p=c.getPretamo();
			for (int i=0;i<p.size();i++) {
				pe=p.get(i);
				if(pe!=null) {
					return p;
				}else {
					return null;
				}
			}
		}else {
			System.out.println("no contiene presttamos");
		}
		
		return null;
	}
}