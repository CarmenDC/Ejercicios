package comparar;

import java.util.ArrayList;
import java.util.Collections;

public class EjecutarPersonaComparacion {

	public static void main(String[] args) {
		
		ArrayList<Persona> listaPersonas = new ArrayList<>();
		
		listaPersonas.add(new Persona("Maria", 165,"Lopez"));
		listaPersonas.add(new Persona("Ana", 168,"Ruiz"));
		listaPersonas.add(new Persona("Jorge", 186,"Martin"));
		listaPersonas.add(new Persona("Angel", 178, "Martin"));
		
		
		Collections.sort(listaPersonas);
		
		System.out.println("Personas ordenadas :" + listaPersonas);
		
		
		Collections.sort(listaPersonas,new OrdenarPorOtro());
		System.out.println("Personas ordenadas :" + listaPersonas);


	}



}
