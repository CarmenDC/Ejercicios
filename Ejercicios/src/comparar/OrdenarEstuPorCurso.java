package comparar;

import java.util.Comparator;

public class OrdenarEstuPorCurso implements Comparator<Estudiante>{

	@Override
	public int compare(Estudiante o1, Estudiante o2) {
		return o1.getCurso()-o2.getCurso();
	}
	

}
