package unidade2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro valor : ");
		int numero1 = scan.nextInt();
		System.out.println("Digite o segundo valor : ");
		int numero2 = scan.nextInt();
		
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1 * numero2;
		float divisao = (float) numero1 / numero2;
		
		System.out.println("Soma= "+soma);
		System.out.println("Subtração= "+subtracao);
		System.out.println("Multiplicação= "+multiplicacao);
		System.out.printf("Divisão= %f3",divisao);
	}

}
