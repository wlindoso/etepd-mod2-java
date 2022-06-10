package digitalbank;

public class Cliente implements Autenticavel {
	
	private String nome;
	private String cpf;
	private String profissao;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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
