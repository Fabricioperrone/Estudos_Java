package CalculadoraJava;

import java.util.Scanner;

public class calculadora {
	
	public static void main(String[] args) {
		double num1, num2, num3;
		int contador;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("------Calculadora Java Desafio L�gica-----");
		System.out.println("");
		
		System.out.println("Insira um valor: ");
		num1 = scan.nextDouble();
		System.out.println("");
		System.out.println("Insira um segundo valor: ");
		System.out.println("");
		num2 =  scan.nextDouble();
		
		System.out.println("Informe qual opera��o deseja fazer: ");
		
		System.out.println("1 Soma");
		System.out.println("2 Subtra��o");
		System.out.println("3 Multiplica��o");
		System.out.println("4 Divis�o");
		System.out.println("5 Potencia��o");
		
		contador = scan.nextInt();
		
	
		switch (contador) {
		case 1:
			num3 = num1+num2;
			System.out.println(num3);
		 
			break;
		case 2:
			num3 = num1-num2;
			System.out.println(num3);
			break;
			
		case 3:
			num3 = num1*num2;
			System.out.println(num3);
			break;
			
		case 4:
			
			num3 = num1/num2;
			System.out.println(num3);
			break;
		case 5:
			num3 =   (int) Math.pow(num1, num2);  // (int) Math.pow(a,3)
			System.out.println("O resultado da potencia��o �: " + num3);
			break;
			
		default:
			System.out.println("Op��o inv�lida, selecione uma op��o v�lida.");
			break;

		}

		
		
		
	}
}
