package br.com.Generation;

import java.util.Scanner;

public class Exercicio_04 {
	
	/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.*/

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num; 
		
		System.out.println("Digite um n�mero inteiro: ");
		num = entrada.nextInt();
		
		if(num %2 == 0){
			System.out.println("Esse n�mero � par e a sua raiz quadrada �: " +Math.sqrt(num));
		}
		
		else {
			System.out.println("Esse n�mero � impar e elevado ao quadrado �: " +Math.pow(num,2));
		}
			
	}

}
