package com.Krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> incorrectos =new ArrayList<Contacto> ();
	private ArrayList<Contacto> corecctos=new ArrayList<Contacto> ();

	public Directorio() {
		contactos = new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return corecctos;
	}

	public void setCorecctos(ArrayList<Contacto> corecctos) {
		this.corecctos = corecctos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}


	public Boolean agregarContacto(Contacto contacto) {
		Contacto cE = buscarPorCedula(contacto.getCedula());
		if (cE == null) {
			contactos.add(contacto);
			return true;
		} else {
			return false;
		}

	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto ec = null;
		for (int i = 0; i < contactos.size(); i++) {
			ec = contactos.get(i);
			if (cedula.equals(ec.getCedula())) {
				return ec;
			}
		}
		return null;
	}

	public String consultarUltimaModificacion() {
		Date fecha = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd//MM//yyyy HH:mm:ss");
		String fechaFormateada = formato.format(fecha);
		return fechaFormateada;
	}

	public int contarPerdidos() {
		Contacto ce = null;
		int sinD = 0;
		for (int i = 0; i < contactos.size(); i++) {
			ce = contactos.get(i);
			if (ce.getDireccion() == null) {
				sinD = sinD + 1;
			}
		}
		return sinD;
	}

	public int contarFijos() {

		Contacto r;
		int conteo = 0;
		Telefono t;

		for (int i = 0; i < contactos.size(); i++) {

			r = contactos.get(i);
			ArrayList<Telefono> telefonos = r.getTelefonos();
			if(telefonos!=null) {
				for (int j = 0; j < telefonos.size(); j++) {
					t = telefonos.get(j);

					if (t.getTipo().equals("Convencional")) {
						if (t.getEstado().equals("C")) {
							conteo = conteo + 1;

						}

					}

				}
			}
		

		}
		return conteo;

	}
	public void depurar() {
		Contacto ce=null;
		for(int i=0;i<contactos.size();i++) {
			ce=contactos.get(i);
			if(ce.getDireccion()==null) {
				incorrectos.add(ce);
			}else {
				corecctos.add(ce);
			}
		}
		contactos.clear();
	}

}
