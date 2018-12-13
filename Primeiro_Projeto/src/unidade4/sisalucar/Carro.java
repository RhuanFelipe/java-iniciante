package unidade4.sisalucar;

public class Carro  extends Veiculo{
	private long idCarro;
	private	String placa;
	private	String fabricante;
	private	String modelo;
	private	int ano;
	private	String cor;
	private	float valorDiaria;
	private	Revendedor revendedor;		
	
	public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria, Revendedor revendedor) {
		super(); // chama o construtor da super classe 
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
	}
	public Carro() {
		
	}
	
	
	public long getIdCarro() {
		return idCarro;
	}
	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}
	public Revendedor getRevendedor() {
		return revendedor;
	}
	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}
	
	public int getPassageiros() { // anulação
		return 4;
	}
	public void acelera(int velocidade) { // sobrecarga
		System.out.println("obedeça o limete de velocidade = "+velocidade);
	}
	
	public void abastecer(int quantidadeLitros) {
		System.out.println("Para abastecer o carro é necessário " + quantidadeLitros + " Litros");
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(3,"T5HH9J-58","FFGGHH-1","MERCEDEZ",2013,"Azul",150.05f,Revendedor.EMANUELVEICULOS);
		carro1.acelera();
		carro1.freia();
		carro1.getPassageiros();
		carro1.getVelocidade();
	}
	
}
