package br.com.Generation;

import java.util.Scanner;

public class Exercicio_02 {
	
	/*Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2, n3;
		
		System.out.println("Digite os 3 n�meros que deseja colocar em ordem crescente: ");
		n1 = entrada.nextDouble();
		n2 = entrada.nextDouble();
		n3 = entrada.nextDouble();
		
		if(n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente dos 3 n�meros digitados �: " + n1+ ", " +n2+  " e " +n3);	
		}
			else if(n1 <= n3 && n3 <= n2) {
				System.out.println("A ordem crescente dos 3 n�meros digitados �: " + n1+ ", " +n3+  " e " +n2);	
			}
				else if(n2 <= n1 && n1 <= n3) {
					System.out.println("A ordem crescente dos 3 n�meros digitados �: " + n2+ ", " +n1+  " e " +n3);	
				}		
					else if(n2 <= n3 && n3 <= n1) {
						System.out.println("A ordem crescente dos 3 n�meros digitados �: " + n2+ ", " +n3+  " e " +n1);	
					}		
						else if(n3 <= n1 && n1 <= n2) {
							System.out.println("A ordem crescente dos 3 n�meros digitados �: " + n3+ ", " +n1+  " e " +n2);	
						}
							
							else{
								System.out.println("A ordem crescente dos 3 n�meros digitados �: " +n3+ ", "  +n2+ " e " +n1);
							}
	}

}
