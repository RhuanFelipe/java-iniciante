package unidade3.sisalucar;

public enum Revendedor {
	ABCVEICULOS("101010/0001","Rua do sol, 5000", "Volskvagen") ,
	SIMAOVEICULOS("101010/0002","Caxangá, 1500", "Honda"),
	EMANUELVEICULOS("101010/0003","Areias, 9999", "Toyota");
	String cnpj;
	String endereco;
	String dabricante;
	
	private Revendedor(String cnpj, String endereco, String dabricante) {
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.dabricante = dabricante;
	}
	
}
