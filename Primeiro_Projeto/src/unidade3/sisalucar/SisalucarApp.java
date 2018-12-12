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
		
		carro1.setIdCarro(1);
		carro1.setModelo("gol");
		carro1.setCor("Azul");
		carro1.setPlaca("KDI-9999");
		carro1.setAno(2013);
		carro1.setFabricante("wolkswagen");
		carro1.setValorDiaria(99.90f);
		totalCarros += 1;
		
		cliente1.setIdCliente(1);
		cliente1.setNome("Rhuan Felipe");
		cliente1.setCpf("999.999.999-99");
		cliente1.setCnh("XJO95-223");
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		//sisalucar.gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));
		gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5));
	}
	public void realizarLocacao( long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao = new Locacao();
		locacao.setIdCliente(idCliente);
		locacao.setIdCarro(idCarro);
		locacao.setIdLocacao(1);
		locacao.setDataInicial(LocalDate.now());
		locacao.setDataFinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * valorDiaria);
	}
	public static void gerarRelatorioLocacao(Carro carro,LocalDate ...datas) { //varargs
		float totalFaturado = carro.getValorDiaria();
	}
}
