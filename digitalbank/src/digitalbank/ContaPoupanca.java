package digitalbank;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	void deposita(double valor) {
		super.saldo += valor;
	}
}
