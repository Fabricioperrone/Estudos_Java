
public class TestaDesconto {
	
	public static void main(String[] args) {
	 Estoque desconto = new Estoque();
	 desconto.valorTotal = 3000;
	 desconto.desconta(0.10);
		 
	System.out.println(desconto.valorTotal);
	 
	}
}
