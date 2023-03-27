package com.loiane.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		/*System.out.println("Digite seu nome completo: ");
		String nomeCompleto = entrada.nextLine();
		System.out.println("Seu nome completo é: " +nomeCompleto);
		
		System.out.println("Digite seu primeiro nome");
		String primeiroNome = entrada.next();
		System.out.println("Seu primeiro nome é: " +primeiroNome);*/
		
		/*System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite sua altura:");
		Double altura = entrada.nextDouble();
		System.out.println("Sua altura é: "+ altura);*/
		
		System.out.println("Digite o seu primeiro nome idade, quantidade de filhos, altura e se tem Pets.");
		String primeiroNome = entrada.next();
		int idade = entrada.nextInt();
		byte qtdFilhos = entrada.nextByte();
		float altura = entrada.nextFloat();
		boolean temPet = entrada.nextBoolean();
		
		System.out.println("Você digitou os seguintes dados: ");
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.println("Sua idade: " + idade);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Pets:" + temPet);
		
	}
}
