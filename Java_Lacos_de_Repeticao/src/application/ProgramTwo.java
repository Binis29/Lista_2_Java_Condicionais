/*
 * 2-	Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
package application;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {
		
		final int VALORES = 10;
		Scanner sc = new Scanner(System.in);
		double [] numero = new double[VALORES];
		double save;
		
		for(int i = 0; i < VALORES; i++) {
			System.out.println("Entre com um n�mero: ");
			numero [i] = sc.nextDouble();
		}
		
		for(int i = 0; i < VALORES; i++) {
				
			
			for(int j=0; j<numero.length; j++)
				
				if(numero[i] <= numero[j]) {
					save = numero [i];
					numero[i] = numero [j];
					numero [j] = save;
				}
						
			} 
		System.out.println();
		
		for(int i = 0; i < VALORES; i++) {
			
			System.out.println(numero[i]);
		}
		
		sc.close();

	}

}
