package comparar;

public class Estudiante implements Comparable<Estudiante>{
	
	private String nombre;
	private int edad;
	private int curso;
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public int getCurso() {
		return curso;
	}
	public Estudiante(String nombre, int edad, int curso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	@Override
	public int compareTo(Estudiante o) {
		return this.nombre.compareTo(o.nombre);
	}
	@Override
	public String toString() {
		return "Nombre Estudiante: " + nombre + ", edad: "  + edad + ", curso: " + curso;
	}
	
	
	
	
}
