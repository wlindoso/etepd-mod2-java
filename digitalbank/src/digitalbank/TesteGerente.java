package digitalbank;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Maria Jos�");
		g1.setCpf("111.111.111-11");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(22222);
		
		System.out.println("O gerente conseguiu se autenticar? " + autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}

}
