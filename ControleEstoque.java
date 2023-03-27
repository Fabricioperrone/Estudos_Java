
public class ControleEstoque {

	public static void main(String[] args) {
		
		Estoque PS4 = new Estoque();
		PS4.produto = "PS4";
		PS4.preco = 2.999;
		PS4.quantidade = 10;
		PS4.valorTotal = 0;
		
		Estoque GamePS4 = new Estoque();
		GamePS4.produto = "Call Of Dutty";
		GamePS4.preco = 100;
		GamePS4.quantidade = 30;
		GamePS4.valorTotal = 0;
		
		Estoque ControlePS4 = new Estoque();
		ControlePS4.produto = "DualShock4";
		ControlePS4.preco = 200;
		ControlePS4.quantidade = 40;
		ControlePS4.valorTotal = 0;
	}

}
