package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero ");

		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo n�mero: ");

		int num2 = scan.nextInt();
		
		if(num1 > num2) {
			System.out.println("O num1 � maior: " + num1 );
		}else {
			System.out.println("O num2 � maior: " + num2);
		}

	}
}