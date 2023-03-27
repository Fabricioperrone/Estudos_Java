package mentoria;

import java.util.Scanner;

public class ConversorSegundos {

	public static void main(String[] args) {
		System.out.println("---Exerc�cio 14---");
		int segundos;  
		int minutos;
		int  hora;
		int segundosBrutos;
		System.out.printf("Entre com um valor em segundos: ");

		segundosBrutos = recebeSegundos(); // chamando a fun��o/  recebe valor inserido pelo user
		minutos  = converteSegundoParaMinutos(segundosBrutos); /*
														 * retorna segundo convertido em minutos que /*segundos % 60
														 * 
														 */
		hora = converteMinutosEmHoras(minutos);
		segundos = trataSegundos(segundosBrutos);
		minutos = trataMinutos(minutos);
		
	
		//System.out.println("A convers�o de segundos em horas  �:\n" + hora + " Hora " + minutos + " minutos " + segundos + " segundos ");
		System.out.printf("A convers�o de segundos em horas:%n%s hora em %s minutos e %s segundos ", hora, minutos, segundos);
		
	}

	private static int trataMinutos(int minutos) {
		int minutosFuncao =  minutos % 60;
		return minutosFuncao;
	}

	private static int trataSegundos(int segundosBrutos) {
		int segundosDaFuncao =  segundosBrutos % 60;
		return segundosDaFuncao;
	}

	public static int recebeSegundos() {// executa e retorna algo, void s� executa e n�o retorna nada
		Scanner scan = new Scanner(System.in);
		int segundos = scan.nextInt();
		scan.close();
		return segundos;
	}

	public static int converteSegundoParaMinutos(int segundos) {
		int minutos = segundos / 60; // calculando com o param�tro da fun��o
		return minutos;
	}

	public static int converteMinutosEmHoras(int minutos) {
		int hora = minutos /60;
		return hora;
	}

	 
}
