package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exe5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Metros? ");
		double metros = scan.nextFloat();
		
		double centimetros = metros * 100;
		
		System.out.printf(metros + " m é igual a: "  + centimetros + " centimetros");
		scan.close();
	}

}
