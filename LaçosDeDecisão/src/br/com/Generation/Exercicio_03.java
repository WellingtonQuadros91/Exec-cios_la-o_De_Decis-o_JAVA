package br.com.Generation;

import java.util.Scanner;

public class Exercicio_03 {
	
	/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:
	
	*10-14 infantil
 	*15-17 juvenil
 	*18-25 adulto                                */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade; 
		
		System.out.println("Digite a idade da pessoa: ");
		idade = entrada.nextInt();
		
		if(idade >= 10 && idade <= 14){
			System.out.println("Essa pessoa pertence a categoria Infantil");
		}
		
		else if(idade >= 15 && idade <= 17){
			System.out.println("Essa pessoa pertence a categoria Juvenil");
		}
		
		else if(idade >= 18 && idade <= 25){
			System.out.println("Essa pessoa pertence a categoria Adulto");
		}
		
		else if (idade < 10 || idade > 25){
			System.out.println("Essa pessoa não pertence a nenhuma categoria definida");
		}
		
	                       
	}

}
