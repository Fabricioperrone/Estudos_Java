package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o valor de A:");
		int a = scan.nextInt();

		if (a == 0) {
			System.out.println("Não é equação de segundo grau");
		} else {
			System.out.println("Entre com o valor de B:");
			int b = scan.nextInt();

			System.out.println("Entre com o valor de C:");
			int c = scan.nextInt();

			double delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Delta negativo ");
			} else {
				
				System.out.println("Delta: " + delta);

				// Calcula a raiz quadrada de DELTA
				double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				
				 System.out.println("x1 = " + x1);
				 System.out.println("x2 = " + x2);
			}

		}

	}
}
