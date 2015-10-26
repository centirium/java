/**
 * 
 */
package org.cuatrovientos.variables;

import java.util.Scanner;

/**
 * @author javier_lorda
 *
 */
public class Variables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//numerico
		byte microNum=120;
		short minuNumero =6;
		int otroNumero;
		long numerazo=123456789;
		double sueldoMessi=521426644.45d;
		
	//con decimales
		float miPeso=70.60f;
	char letra='x';
	char salto='\n';
	boolean aprobare=true;
	String nombre= "Matt Damon";
	System.out.println(nombre);//imprime el valor de esta variable en pantalla
	
	
	//conversion de una variable en otra
	Scanner reader=new Scanner(System.in);
	String linea="";
	System.out.println("dame un numero");
	linea= reader.nextLine();
	int numero=Integer.parseInt(linea);
	int resultado =numero *2;
	System.out.println(resultado);
	
	
	
	
	
	}

}
