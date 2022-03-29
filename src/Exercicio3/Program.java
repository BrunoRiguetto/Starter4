package Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a descrição do produto: ");
		String descricao = sc.nextLine();
		System.out.print("Digite o valor do produto: ");
		double valorReal = sc.nextDouble();
		System.out.print("Digite a operação se for Desconto = D e se for acrescismo = A: ");
		char operacao = sc.next().charAt(0);
		System.out.print("Qual a porcentagem de desconto ou acrescimo? ");
		double percentual = sc.nextDouble();
		
		Produto prod = new Produto(descricao, valorReal, operacao, percentual);
		
		prod.operacao(valorReal, percentual);
		
		System.out.printf("O valor do produto é: %.2f", prod.getValorFinal());

	}

}
