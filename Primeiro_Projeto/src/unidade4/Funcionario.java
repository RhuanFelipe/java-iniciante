package unidade4;

public abstract class Funcionario {
	
	public abstract void getBonificacao();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario antonio = new Professor();
		Funcionario andreia = new Administrativo();
		Funcionario pedro = new Diretor();
		((Diretor)pedro).departamento = "RH";
		
		pedro.verificarFuncionario(pedro);
		antonio.verificarFuncionario(antonio);
	}
	public void verificarFuncionario(Funcionario objeto) {
		if(objeto instanceof Diretor) {
			System.out.println("Diretor");
		}else if(objeto instanceof Professor) {
			System.out.println("Professor");
		}else if(objeto instanceof Administrativo) {
			System.out.println("Administrativo");
		}
	}
}
