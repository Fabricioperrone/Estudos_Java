package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int numero = teclado.nextInt();
		System.out.println("O n�mero informado foi: " + numero);
		teclado.close();

	}

}
