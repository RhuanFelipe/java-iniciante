package unidade4.sisalucar;

public class Moto extends Veiculo {
	
	public int getPassageiros() { // anula��o
		return 1;
	}
	public void acelera(int velocidade) { // sobrecarga
		System.out.println("obede�a o limete de velocidade = "+velocidade);
	}
}
