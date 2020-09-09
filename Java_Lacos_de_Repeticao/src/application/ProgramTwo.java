/*
 * 2-	Faça um programa que entre com três números e coloque em ordem crescente.
 */
package application;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {
		
		final int VALORES = 10;
		Scanner sc = new Scanner(System.in);
		double [] numero = new double[VALORES];
		double auxiliar;
		
		for(int i = 0; i < VALORES; i++) {
			System.out.println("Entre com um número: ");
			numero [i] = sc.nextDouble();
		
			for(int j=0; j<numero.length; j++)
				
				if(numero[i] <= numero[j]) {
					auxiliar = numero [i];
					numero[i] = numero [j];
					numero [j] = auxiliar;
				}
		}
		
		System.out.println();
		
		for(int i = 0; i < VALORES; i++) {
			
			System.out.println(numero[i]);
		}
		
		sc.close();

	}

}
