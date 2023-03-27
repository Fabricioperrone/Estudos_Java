package com.loiane.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.marca);
		System.out.println(van.modelo);

		van.exibirAutonmia(); // nome de método sempre inicia com verbo. ex: andar,dirigir, exibir,
								// calcular... etc

		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());

		double qtdCobustivel10 = van.calcularCombustivel(10);
		double qtdCobustivel15 = van.calcularCombustivel(15);

		System.out.println("qtdCombustivel10 = " + qtdCobustivel10);

		System.out.println("qtdCombustivel15 = " + qtdCobustivel15);

	}

}
