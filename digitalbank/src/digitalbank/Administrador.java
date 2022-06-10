package digitalbank;

public class Administrador extends Funcionario implements Autenticavel {

	private String senha;
	
	@Override
	public double getBonificacao() {
		return super.getSalario() * 0.1;
	}

	@Override
	public void setSenha(int Senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha.equals(senha)) {
			return true;
		}
		return false;
	}

}
