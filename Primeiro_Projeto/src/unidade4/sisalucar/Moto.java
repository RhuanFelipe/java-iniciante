package unidade4.sisalucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() { // anulação
		return 1;
	}
	public void acelera(int velocidade) { // sobrecarga
		System.out.println("obedeça o limete de velocidade = "+velocidade);
	}
}
