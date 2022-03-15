package ejecutando;

import java.util.ArrayList;
import java.util.List;

import universidad.Carrera;
import universidad.Estudiante;

public class EjecutandoSistema {

	public static void main(String[] args) {
		Carrera carrera1 = new Carrera (1003, "Ciencias Economicas");
		List<String> cienciasEco = new ArrayList<>();
		cienciasEco.add("Economía de la regulación ");
		cienciasEco.add("Sociología y Estructura Social ");
		cienciasEco.add("Fundamentos del Marketing ");
		cienciasEco.add("Historia del pensamiento Económico");
		carrera1.setAsignaturas(cienciasEco);
		
		Carrera carrera2 = new Carrera (1114, "Música");
		List<String> music = new ArrayList<>();
		music.add("Teoría de la Música ");
		music.add("Lenguaje musical ");
		music.add("Historia de la música ");
		music.add("Desarrollo instrumental");
		carrera2.setAsignaturas(music);
		
		Estudiante estudiante = new Estudiante("Juan Andres Tafur", 26, carrera1);
		imprimir(estudiante);
		
		Estudiante estudiante1 = new Estudiante("Ana Lozano", 28, carrera2);
		imprimir(estudiante1);
		
	}

	public static void imprimir (Estudiante student) {
		System.out.println("Datos del estudiante: " + student.obtenerDetalles());
	}
}
