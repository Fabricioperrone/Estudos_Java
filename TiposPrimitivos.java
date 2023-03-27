package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Informações do funcionário
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //Literal
		
		//Tipos numéricos
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		
		//Tipos booleano
		boolean  estaDeFerias = false; // true
		
		// Tipo caractere 
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " +  status);
	}
}
