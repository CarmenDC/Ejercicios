package comparar;

import java.util.Comparator;

public interface OrdenarPorLoQueQuiera extends Comparator<Persona>, Comparable<Persona> {
	
	public default int compare (Persona o1, Persona o2) {
		return o1.getIdPersona() - o2.getIdPersona();
		}

}
