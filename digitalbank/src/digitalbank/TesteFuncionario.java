package digitalbank;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("José Mario");
		f1.setCpf("111.111.111-11");
		f1.setSalario(2590.0);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
		
	}

}
