package unidade4;

public class Professor extends Funcionario implements Autenticavel, Contribuinte, Cidadao{

	@Override
	public void getBonificacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void votar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRG() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pagarIR() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getCPF() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
