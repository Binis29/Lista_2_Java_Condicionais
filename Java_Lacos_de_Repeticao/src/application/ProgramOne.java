/*
 * 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.

 */

package application;

import java.util.Scanner;

public class ProgramOne {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, maior = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com um valor inteiro: ");
			x = sc.nextInt();
			
			if(maior < x ) {
				maior = x;
			}
			
		}
		
		System.out.println("O maior número é: " + maior);
		sc.close();	
	}

}
