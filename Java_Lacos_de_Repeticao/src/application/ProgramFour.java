/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

 */

package application;

import java.util.Scanner;

public class ProgramFour {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Entre com um valor qualquer: ");
		valor = sc.nextDouble();
		
		if(valor%2 == 0) {
			System.out.println("Este número é par!");
			
			System.out.printf("A raiz quadrada de %.2f é: %.2f", valor, Math.sqrt(valor));
		} else {
			System.out.println("O número é ímpar!");
			
			System.out.printf("O quadrado de %.2f é: %.2f", valor, Math.pow(valor, 2));
		}
		
		sc.close();

	}

}
