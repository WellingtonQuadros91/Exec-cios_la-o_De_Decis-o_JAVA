package br.com.Generation;

import java.util.Scanner;

public class Exercicio_01 {
	
	/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1� numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2� numero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3� numero: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero foi: " +n1);
		}
			if(n2 > n1 && n2 > n3) {
				System.out.println("O maior n�mero digitado foi: " +n2);
			}	
				if(n3 > n1 && n3 > n2) {
					System.out.println("O maior n�mero digitado foi: " +n3);
				}
				
				
	}

}
