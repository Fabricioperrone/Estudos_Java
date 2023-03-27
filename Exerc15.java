package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o lado 1:");
		int lado1 = scan.nextInt();
		
		System.out.println("Entre com o lado 2:");
		int lado2 = scan.nextInt();
		
		System.out.println("Entre com o lado 3:");
		int lado3 = scan.nextInt();

		if(((lado1 + lado2) > lado3) ||
				((lado1 + lado3) > lado2) ||
				((lado2 + lado3) > lado1)) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("Tri�ngulo Equil�tero");
			} else if(lado1 != lado2 && lado1  != lado3 && lado3 != lado2) {
				System.out.println("Tri�ngulo escaleno");
			} else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("Triangulo Is�celes");
			}
			
		} else {
			System.out.println("N�o forma um triangulo.");
		}

	}

}
