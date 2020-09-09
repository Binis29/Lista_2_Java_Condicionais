/*
 * 2-	Faça um programa que entre com três números e coloque em ordem crescente.
 */
package application;

import java.util.Scanner;

public class ProgramTwo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double [] numero = new double[3];
		double save;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Entre com um número: ");
			numero [i] = sc.nextDouble();
		}
		
		for(int i = 0; i < 3; i++) {
				
			
			for(int j=0; j<numero.length; j++)
				
				if(numero[i] <= numero[j]) {
					save = numero [i];
					numero[i] = numero [j];
					numero [j] = save;
				}
						
			} 
		
		for(int i = 0; i < 3; i++) {
			System.out.println(numero[i]);
		}
		
		sc.close();

	}

}
