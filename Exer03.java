package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com uma letra (F ou M): ");
		String input = scan.next();

		if (input.equalsIgnoreCase("f")) { // Assim que se compara String
			System.out.println("F - feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}
	}

}
