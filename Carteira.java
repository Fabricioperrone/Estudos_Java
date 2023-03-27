
public class Carteira {

	public static void main(String[] args) {
		
		Produtos pilha = new Produtos();
		pilha.nomeProd = "amarela";
		pilha.qtd = 10;
		pilha.valor = 1;
		pilha.totalPg = 10.00;
		
		
		pilha.desconto(0.01);
		
	}

}
