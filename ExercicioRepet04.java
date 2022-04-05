package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet04 {
	
	/*
	 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	o número de pessoas calmas;
	o número de mulheres nervosas;
	o número de homens agressivos;
 	o número de outros calmos;
	o número de pessoas nervosas com mais de 40 anos;
	o número de pessoas calmas com menos de 18 anos.
	 */
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int pessoas=0, idade=0, sexo=0, persona=0, c = 0, n = 0, a = 0;
		int ferminino = 1, masculino = 2, outros = 3;
		int calmos = 1, nervosas = 2, agressivo = 3;

		while (pessoas<= 5) {

			
			System.out.println("informe sua idade:");
			idade = entrada.nextInt();
			System.out.println("De 1 á 3 informe seu sexo sendo 1ferminino,2masculino ou 3outros?");
			sexo = entrada.nextInt();
			System.out.println("Sua personalidade é de 1 á 3 sendo 1calma, 2 nervosa ou 3 agressivo?");
			persona = entrada.nextInt();

			if (calmos == c) {
				c++;
				System.out.println("total de pessoas calmas:" + persona);
			}

			else if(sexo == calmos) {
				sexo = ferminino+ c;
				System.out.println("quantidade de mulheres calmas" + sexo);
				sexo++;
 
			}

			else if (sexo == agressivo) {
				sexo = masculino + a;
				System.out.println("quantidade de homens agressivos" + sexo);
				sexo++;
			}

			else if (sexo == calmos) {
				sexo = outros + c;
				System.out.println("Quantidade de outros calmos" + sexo);
				sexo++;
			}

			else if (idade == nervosas && idade > 40) {
				idade = nervosas + n;
				System.out.println("Quantidade de pessoas com mais de 40 anos agressivas" + idade);
				idade++;

			} else if (idade== calmos && idade < 18) {
				idade = calmos+ c;
				System.out.println("Quantidade de pessoas com menos de 18 anos calmas" + idade);
				idade++;
			}
				
		}

	}



}