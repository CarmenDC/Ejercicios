package comparar;

public class Persona implements Comparable<Persona>, OrdenarPorLoQueQuiera{
	
	private static int identificador;
	private int idPersona;
	private String nombre;
	private String apellido;
	private int altura;
	
	
	
	public int getIdPersona() {
		return idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public int getAltura() {
		return altura;
	}

	public Persona(String nombre, int altura, String apellido) {
		super();
		identificador++;
		this.idPersona = identificador;
		this.nombre = nombre;
		this.altura = altura;
		this.apellido=apellido;
	}

	@Override
	public int compareTo(Persona o) {
		return this.apellido.compareTo(o.apellido);
	}

	@Override
	public String toString() {
		return "Persona [id=" + idPersona + ", nombre=" + nombre + ", altura=" + altura + "]";
	}

	
}
