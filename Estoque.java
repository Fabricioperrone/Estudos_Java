
public class Estoque {

	String produto;
	double preco;
	int quantidade;
	double valorTotal;
	
	public void desconta(double valor) {
		this.valorTotal = preco * quantidade;
	}
}
