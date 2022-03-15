package universidad;

public class Estudiante {
	private String nombreEstudiante;
	private int edad;
	private Carrera carrera;
	public Estudiante(String nombreEstudiante, int edad, Carrera carrera) {
		super();
		this.nombreEstudiante = nombreEstudiante;
		this.edad = edad;
		this.carrera = carrera;
	}
	public String getNombreEstudiante() {
		return nombreEstudiante;
	}
	public void setNombreEstudiante(String nombreEstudiante) {
		this.nombreEstudiante = nombreEstudiante;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	public String obtenerDetalles() {
		return "Nombre del estudiante " + this.nombreEstudiante + ", edad " + this.edad + 
				", programa: " + this.carrera;
				
	} 

}
