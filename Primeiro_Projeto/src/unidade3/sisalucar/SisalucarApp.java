package unidade3.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	static int totalCarros = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();		
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.cor = "Azul";
		carro1.placa = "KDI-9999";
		carro1.ano = 2013;
		carro1.fabricante = "wolkswagen";
		carro1.valorDiaria = 99.90f;
		totalCarros += 1;
		
		cliente1.idCliente = 1;
		cliente1.nome = "Rhuan Felipe";
		cliente1.cpf = "999.999.999-99";
		cliente1.cnh = "XJO95-223";
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.idCarro, cliente1.idCliente, carro1.valorDiaria);
		//sisalucar.gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));
		gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));
	}
	public void realizarLocacao( long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao = new Locacao();
		locacao.idCliente = idCliente;
		locacao.idCarro = idCarro;
		locacao.idLocacao = 1;
		locacao.dataInicial = LocalDate.now();
		locacao.dataFinal = LocalDate.now().plusDays(2);
		locacao.valorLocado = 2 * valorDiaria;
	}
	public static void gerarRelatorioLocacao(Carro carro,LocalDate ...datas) { //varargs
		float totalFaturado = carro.valorDiaria;
	}
}
