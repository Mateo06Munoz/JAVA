package entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante() {
		notas = new ArrayList<>();
	}

	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public void agregarNota(Nota nuevaN) {
		ArrayList<Nota> n = new ArrayList<Nota>();
		Materia mn = nuevaN.getMateria();
		Nota en = null;
		Materia em = null;
		if (nuevaN.getCalificacion() >= 0 && nuevaN.getCalificacion() <= 10) {
			for (int i = 0; i < n.size(); i++) {
				en = n.get(i);
				em = en.getMateria();
				if (em.getCodigo() != mn.getCodigo()) {
				}
				n.add(nuevaN);
				System.out.println("NOTA AGREGADA.");
			}
		} else {
			System.out.println("ERROR: LA NOTA DEBE ESTAR ENTRE 0-10");
		}

	}

	public void moificarNota(String codigo, double nuevaN) {
		ArrayList<Nota> n = new ArrayList<Nota>();
		Nota en = null;
		Materia em = null;
		for (int i = 0; i < n.size(); i++) {
			en = n.get(i);
			em = en.getMateria();
			if (codigo.equals(em.getCodigo())) {
				if (nuevaN >= 0 && nuevaN <= 10) {
					en.setCalificacion(nuevaN);
				}
			} else {
				System.out.println("no encontró el codigo");
			}
		}
	}

	public double calcularPromedioNotasEstudiante() {
		ArrayList<Nota> nh = new ArrayList<Nota>();
		double promedio = 0.0;
		Nota n = null;
		int nm = 0;
		double suma = 0.0;
		for (int i = 0; i < nh.size(); i++) {
			suma = suma + n.getCalificacion();
			nm = nm + nh.size();
		}
		promedio = suma / nm;
		return promedio;
	}

	public void mostrar() {
		ArrayList<Nota> ny = new ArrayList<Nota>();
		Nota n = null;
		Materia m = null;
		for (int i = 0; i < ny.size(); i++) {
			n = ny.get(i);
			m = n.getMateria();

			System.out.println("Estudiante[nombre: " + nombre + ", apellido: " + apellido + ", cedula: " + cedula
					+ m.toString() + ", codigo de la materia: " + m.getNombre() + ", calificacion: "
					+ n.getCalificacion() + "]");
		}
	}

}
