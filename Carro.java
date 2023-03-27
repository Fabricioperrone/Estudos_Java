package com.loiane.cursojava.aula24;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// metodo simples: sem retorno e/ou par�metro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km");
	}

	// m�todo com retorno
	double obterAutonomia() {

		System.out.println("M�todo obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	// M�todo com par�metro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
