/**
 * 
 */
package org.cuatrovientos.condicionales;

import java.util.Scanner;

/**
 * @author javier_lorda
 *
 */
public class Condicionales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = 0;
		String linea = "";

		System.out.println("dame algo");
		linea = reader.nextLine();
		a = Integer.parseInt(linea);

//		if (a == 0) {
//			System.out.println("Eres un cero");
//		}else{
//			System.out.println("no eres un cero");
//		}
//		if (a<0){
//			System.out.println("eres negativo");
//		}	else {
//			System.out.println("eres un cero");
//		}
//
		switch (a){
		case 1:
		case 3:
		case 5:
				System.out.println("a es 5");
				break;
		case 9:
			System.out.println("a es 9");
			break;
		default:
			System.out.println("a no es nada de lo anterior");
		break;
		}
	}
}