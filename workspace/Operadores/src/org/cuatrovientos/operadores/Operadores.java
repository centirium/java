/**
 * 
 */
package org.cuatrovientos.operadores;

/**
 * @author javier_lorda
 *
 */
public class Operadores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a=6;
		int b=7;
		int c=0;
		// aritmeticas
		// +.-.*./.%
		
		c=a + b;
		c=a % b;
		c=a ^ b;
		c=-a;
		
		a++;//incrementa 1 
		++a;//se realiza primero la suma
		
		a--;
		--a;
		
		//ojo
		b=++a;
		b=a++;
		//abreviados
		
		//es lo mismo
		b=b + 3;
		b+=3;
		
		String frase ="hello";
		frase= frase + "world";
		//comparacion >, <, >=,<=,==,!=
		
		boolean result = a > b;
		
		String name="pello";
		
		//ojo al comparar strings, ASI NOOOOOO
		//result=name=="pello";
		result=name.equals("pello");
		
		//booleanas
		// &, |, &&, ||, ! (not),^(xnot)
		result= (5>4) & (4<5);
		
		result=!result;
		
		//ternario o elvis
		int resultado=(a > b)?100:b; // mejor no hacer 
		
		
		
	}

}
