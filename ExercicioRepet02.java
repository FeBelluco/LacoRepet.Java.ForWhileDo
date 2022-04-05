package br.com.generation.exerciciorepet;

import java.util.Scanner;

public class ExercicioRepet02 {

	//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n = 0;
		int par = 0, impar = 0;
		
		for(int num = 1; num <= 10; num++) {
			System.out.print("Entre com um número: ");
			n = entrada.nextInt();
			
		if(n % 2 == 0) {
			++par;
		}
		else { 
			impar++;
		}
		}
		System.out.println("A quantidade de número pares é: " + par);
		System.out.println("A quantidade de números impares é: " + impar);
		
		entrada.close();
	}
}

