package fundamentos;

import java.util.Scanner;

public class DesafioScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o primeiro sal�rio: ");
		String num1 = entrada.nextLine().replace(",","."); // Faz a troca de virgula por ponto
		System.out.print("Entre com o segundo sal�rio: ");
		String num2 = entrada.nextLine().replace(",", ".");
		System.out.print("Entre com  terceiro sal�rio: ");
		String num3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println("A m�dia dos sal�rios �:  " + media);
		entrada.close(); 

	}
}
