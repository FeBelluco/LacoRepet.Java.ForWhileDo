package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet05 {
	
	/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
	*/
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num, resultado = 0;
		
		do {
			System.out.print("Digite um n�mero:");
			num = entrada.nextInt();
			resultado += num;
			}
		while(num != 0);
		System.out.println("A soma dos n�meros digitados �: " + resultado);
		entrada.close();
	}		
}
