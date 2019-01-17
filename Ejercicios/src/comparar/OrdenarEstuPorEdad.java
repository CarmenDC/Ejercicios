package comparar;

import java.util.Comparator;

public class OrdenarEstuPorEdad implements Comparator<Estudiante>{

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getEdad()-o2.getEdad();
	}
	

}
