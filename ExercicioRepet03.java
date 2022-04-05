package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet03 {

	/*
	 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, novo = 0, velho = 0;
		
		while(i != -99) {
			
			System.out.print("Digite a idade: ");
			i = entrada.nextInt();	
		
		if(i > -1 && i <= 21) {
			novo++;
			}	
		
		else if(i > 50) {
			velho++;
			}
		}
		System.out.println("Total de pessoas abaixo de 21 anos: " + novo);
		System.out.println("Total de pessoas acima de 50 anos: " + velho);
		entrada.close();
	}
}
