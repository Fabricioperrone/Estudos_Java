package com.loiane.cursojava.aula15labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um número");
		
		int numero = scan.nextInt();
		
		if(numero >= 0) {
			System.out.println("O número  informado é positivo");
		}else {
			System.out.println("O número informado é negativo");
		}
		
	}
	

}
