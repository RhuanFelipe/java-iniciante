package unidade4;

public class ContaCorrente extends Conta {
	
	public void atualizar(double taxa) {
		saldo = saldo + saldo * taxa*2;
	}
}
