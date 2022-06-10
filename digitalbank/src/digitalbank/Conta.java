package digitalbank;

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	abstract void deposita(double valor);

	boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}

	boolean transfere(double valor, Conta contaDestino) {
		if (this.saldo >= valor) {
			this.saca(valor);
			contaDestino.deposita(valor);
			return true;
		}
		System.out.println("Saldo insuficiente!");
		return false;
	}
	
	double getSaldo(){
		return this.saldo;
	}

}
