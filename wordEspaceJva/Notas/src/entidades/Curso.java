package entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante es = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			es = estudiantes.get(i);
			if (estudiante.getCedula().equals(es.getCedula())) {
				return es;
			} else {
				return null;
			}
		}
		return null;
	}

	public void matricularEstudiantes(Estudiante estudiante) {
		Estudiante eE = null;
		eE = buscarEstudiantePorCedula(estudiante);
		if (eE == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		Estudiante e = new Estudiante();
		double sumaPE = 0.0;
		double promedioCurso;
		double promedioE = e.calcularPromedioNotasEstudiante();
		sumaPE = sumaPE + promedioE;
		promedioCurso = sumaPE / estudiantes.size();
		return promedioCurso;
	}

	public void mostrar() {
		Estudiante E = null;
		ArrayList<Nota> n = new ArrayList<Nota>();
		Nota EN = null;
		for (int i = 0; i < estudiantes.size(); i++) {
			E = estudiantes.get(i);
			n = E.getNotas();
			
			System.out.println("Curso[nombre: " + E.getNombre() + ", apellido: " + E.getApellido() + ", cedula"
					+ E.getCedula() );
			if(n!=null) {
				EN = n.get(i);
			System.out.println( "calificacion: "+EN.getCalificacion() + ", nombre de la materia: "
					+ EN.getMateria().getNombre() + ", COD: " + EN.getMateria().getCodigo() + "]");
			}else {	
				System.out.println("]");
			}
		}
	}

}
