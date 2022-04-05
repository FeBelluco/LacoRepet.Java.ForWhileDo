package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet05 {
	
	/*5- Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)
	*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, resultado = 0;
		
		do {
			System.out.print("Digite um número:");
			num = entrada.nextInt();
			resultado += num;
			}
		while(num != 0);
		System.out.println("A soma dos números digitados é: " + resultado);
		entrada.close();
	}		
}
