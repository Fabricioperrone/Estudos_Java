package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do aquivo:");
		double tamaArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet:");
		double velInternet = scan.nextDouble();
		
		double tempo = tamaArquivo / velInternet;
		
		System.out.println("Tempo de download: " + tempo);
		scan.close();
	}
	

}
