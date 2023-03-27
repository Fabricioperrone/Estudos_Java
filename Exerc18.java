package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.err.println("Entre com um número");

		int num = scan.nextInt();

		if (num % 2 == 0) {
			System.out.println("Par");

		} else {
			System.out.println("Ímpar");
		}
	}

}
