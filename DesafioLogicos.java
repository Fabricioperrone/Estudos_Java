package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false ;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comporuTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;

		 // Operador Un�rio!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comporu TV 32\"? " + comporuTV32);
		System.out.println("Comprou Sorvete ? " + comprouSorvete);	
		System.out.println("Mais saud�vel? " + maisSaudavel);
		
	}

}
