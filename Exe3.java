package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um valor: ");

		int valor1 = scan.nextInt();
		System.out.println("Insira um segundo valor:");

		int valor2 = scan.nextInt();
		System.out.println("A soma dos valores é: " + (valor1 + valor2));
		scan.close();

	}

}
