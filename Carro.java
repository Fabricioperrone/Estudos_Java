package com.loiane.cursojava.aula24;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// metodo simples: sem retorno e/ou parâmetro
	void exibirAutonmia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km");
	}

	// método com retorno
	double obterAutonomia() {

		System.out.println("Método obterAutonomia foi chamado.");
		return capCombustivel * consumoCombustivel;
	}

	// Método com parâmetro
	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
