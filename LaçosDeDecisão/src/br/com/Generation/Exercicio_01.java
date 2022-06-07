package br.com.Generation;

import java.util.Scanner;

public class Exercicio_01 {
	
	/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o 1º numero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite o 2º numero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite o 3º numero: ");
		n3 = entrada.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior número foi: " +n1);
		}
			if(n2 > n1 && n2 > n3) {
				System.out.println("O maior número digitado foi: " +n2);
			}	
				if(n3 > n1 && n3 > n2) {
					System.out.println("O maior número digitado foi: " +n3);
				}
				
				
	}

}
