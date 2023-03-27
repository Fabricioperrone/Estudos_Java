package com.loiane.cursojava.aula13labs;

import java.util.Scanner;

public class Exerc13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Ente com o valor/hora: ");
		double valorHora = scan.nextDouble();

		System.out.println("Entre com a quantidade de horas trabalhadas no m�s: ");
		double horas = scan.nextDouble();

		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;

		System.out.println("Sal�rio bruto: " + salarioBruto );
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " +ir);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Sal�rio liquido: " + salarioLiquido);
		scan.close();
	}
}
