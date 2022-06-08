package digitalbank;

public class EditorVideo extends Funcionario {	
	@Override
	public double getBonificacao() {
		return 150.0 + super.getSalario(); 
	}
	
}
