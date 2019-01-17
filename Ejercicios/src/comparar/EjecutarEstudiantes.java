package comparar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EjecutarEstudiantes {

	public static <T> void main(String[] args) {


		Collection<Estudiante> listaEstudiantes = new ArrayList<>();
		
		ArrayList<Estudiante> listaAOrdenar = (ArrayList<Estudiante>) listaEstudiantes; 
		
		listaEstudiantes.add(new Estudiante("Carlos", 19, 3));
		listaEstudiantes.add(new Estudiante("Felipe",21,1));
		listaEstudiantes.add(new Estudiante("Ana",18,4));
		listaEstudiantes.add(new Estudiante("Rosa",15,1));
		listaEstudiantes.add(new Estudiante("Jose", 10,2));
		
		System.out.println(listaEstudiantes);
		
		Collections.sort(listaAOrdenar);
		
		System.out.println(listaEstudiantes);
		
		Collections.sort(listaAOrdenar,new OrdenarEstuPorCurso());
		
		System.out.println(listaEstudiantes);		
		
		Collections.sort(listaAOrdenar,new OrdenarEstuPorEdad());
		
		System.out.println(listaEstudiantes);
		
		
		
	}

}
