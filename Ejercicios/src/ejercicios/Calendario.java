package ejercicios;

import java.util.Calendar;

public class Calendario {

	public static void main(String[] args) {
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println (calendario.getTime());

		Calendar fecha = Calendar.getInstance();
		fecha.set(2019, 1, 3);
		
		System.out.println (fecha.getTime());
		
		int[][] miMatriz = new int[3][2];
		
		   for (int i = 0; i < miMatriz.length; i++) {
		        for (int j = 0; j < miMatriz[0].length; j++) {
		            // hacer la operación que se necesite
		            System.out.print(miMatriz[i][j] + "\t");
		            // uso \t para alinear las columnas
		        }
		        System.out.println(); // siguiente fila
		    }
		
	}
		
}
