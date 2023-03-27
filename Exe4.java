package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		 
		double valor1 = scan.nextDouble();
		
		System.out.println("Digite uma segunda nota: ");
		
		double valor2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		
		double valor3 = scan.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double valor4 = scan.nextDouble();
		
		double media = (valor1 + valor2 + valor3+ valor4) / 4;
		
		if(media <=6) {
			System.out.println("Reprovado!");
		}else
			if(media >=7) {
				System.out.println("Aprovado!");
			}
		
		System.out.println("A média das soma das notas é: " + media);
		
		scan.close();
		
		

	}

}
