/**
 * 
 */
package org.cuatrovientos.bucles;

/**
 * @author javier_lorda
 *
 */
public class Bucles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Bucles infinito everywhere

		int a = 100;
		while (a > 0) {
			System.out.println("voy todo buclao" + a);
			a--;
		}

		do {
			a++;
		} while (a < 10);

		for (int i = 0; i <= 10; i++) {
			System.out.println("termina en " + i);
			if (i == 5) {
				break;
			}
			//continue;
			//mas codigos
			// mas.....
		}

		fuera:
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// ...
				break fuera;
			}
			// ...
			break;
		}
		// bucle infinito for (;;);

		
		
		
		
		
	}

}
