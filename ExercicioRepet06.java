package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet06 {

	/*
	 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, num = 0, soma = 0;
		double media = 0.0;
		
		do {
			System.out.println("Escreva um n�mero: ");
			num = entrada.nextInt();
			
			if(num % 3 == 0 && num != 0) {
				soma = soma + num;
				i++;
				}
			}
			while( num != 0);
			media = soma / i;
			System.out.println("Impress�o da M�dia: " + media);
			entrada.close();
	}
			
}
