package universidad;

import java.util.List;

public class Carrera {
	private int codigo;
	private String nombreCarrera;
	private List<String> asignaturas;
	
	public Carrera(int codigo, String nombreCarrera) {
		super();
		this.codigo = codigo;
		this.nombreCarrera = nombreCarrera;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreCarrera() {
		return nombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		this.nombreCarrera = nombreCarrera;
	}

	public List<String> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<String> asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public String toString() {
		return "Carrera [codigo=" + codigo + ", nombreCarrera=" + nombreCarrera + ", asignaturas=" + asignaturas + "]";
	}
	
	

}
