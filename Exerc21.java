package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com a qtd de litros vendidos");
		double litros = scan.nextDouble();

		System.out.println("Entre com o tipo de combustível");
		String tipo = scan.next();
		// constantes
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDeconto = 0;
		double total = 0;
		double totalDesc = 0;
		if (tipo.equalsIgnoreCase("a")) {

			if (litros <= 20) {
				percDeconto = 3;
			} else {
				percDeconto = 5;
			}

			total = litros * precoAlc;

		} else if (tipo.equalsIgnoreCase("g")) {

			if (litros <= 20) {
				percDeconto = 3;
			} else {
				percDeconto = 5;
			}
			total = litros * precoGas;
		}
		
		totalDesc = (total / 100) * percDeconto;
		
		double precoAPagar = total - totalDesc;
		
		System.out.println("Valor a ser pago: " + precoAPagar);

	}

}
