package unidade4;

public class ContaPoupanca extends Conta {
	
	public void atualizar(double taxa) {
		saldo = saldo + saldo * taxa*3;
	}
}
