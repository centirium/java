/**
 * 
 */
package org.cuatrovientos.numsum;

import java.util.Scanner;

/**
 * @author javier_lorda
 *
 */
public class numsum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("dame un numero");
		String linea= reader.nextLine();
		int num1=Integer.parseInt(linea);
		
		System.out.println("dame otro numero");
		linea= reader.nextLine();
		int num2=Integer.parseInt(linea);
		int resultado =num1 + num2;
		System.out.println("el resultado de sumarlos es " + resultado);	
	}

}
