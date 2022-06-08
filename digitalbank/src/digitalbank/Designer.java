package digitalbank;

public class Designer extends Funcionario {	
	@Override
	public double getBonificacao() {
		return 200.0 + super.getSalario(); 
	}
	
}
