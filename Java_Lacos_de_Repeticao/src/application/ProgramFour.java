/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.

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
			System.out.println("Este n�mero � par!");
			
			System.out.printf("A raiz quadrada de %.2f �: %.2f", valor, Math.sqrt(valor));
		} else {
			System.out.println("O n�mero � �mpar!");
			
			System.out.printf("O quadrado de %.2f �: %.2f", valor, Math.pow(valor, 2));
		}
		
		sc.close();

	}

}
