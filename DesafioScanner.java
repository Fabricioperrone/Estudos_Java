package fundamentos;

import java.util.Scanner;

public class DesafioScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Entre com o primeiro salário: ");
		String num1 = entrada.nextLine().replace(",","."); // Faz a troca de virgula por ponto
		System.out.print("Entre com o segundo salário: ");
		String num2 = entrada.nextLine().replace(",", ".");
		System.out.print("Entre com  terceiro salário: ");
		String num3 = entrada.nextLine().replace(",", ".");

		double salario1 = Double.parseDouble(num1);
		double salario2 = Double.parseDouble(num2);
		double salario3 = Double.parseDouble(num3);
		
		double media = (salario1 + salario2 + salario3)/3;
		
		System.out.println("A média dos salários é:  " + media);
		entrada.close(); 

	}
}
