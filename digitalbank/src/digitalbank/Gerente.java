package digitalbank;

public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) 
			return true;
		else 
			return false;
	}
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.2; 
	}
	
}
