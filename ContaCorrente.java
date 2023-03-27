

//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		//super.saldo = super.saldo + valor; faz a mesma coisa que o c�digo acima
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	} 
}
 