package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro n�mero: ");
		int num1 = scan.nextInt();

		System.out.println("Entre com o segundo n�mero: ");
		int num2 = scan.nextInt();

		System.out.println("Entre com o terceiro n�mero: ");
		int num3 = scan.nextInt();

		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num1 � menor
			//num3 � maior
			// num1 < num2 < num3
			
			System.out.println(num3 + " - " + num2 + " - " + num1);
		} else if (num2 <= num2 && num1 <= num3 && num2 <= num1) {
			System.out.println(num2 + " - " + num3 + " - " + num1);
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			System.out.println(num3 + " - " + num1 + " - " + num2);
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			System.out.println(num1 + " - " + num3 + " - " + num2);
		}else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			System.out.println(num2 + " - " + num1 + " - " + num3);
		}else if (num2 <= num1 && num2 <= num3 && num2 <= num1) {
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}
	}
}
