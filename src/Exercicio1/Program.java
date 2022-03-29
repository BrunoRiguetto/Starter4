package Exercicio1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("O pagamento será feito por Credito ou Debito? ");
		String tipoPagamento = sc.nextLine();
		System.out.print("Qual a bandeira do seu cartão? ");
		String bandeiraCartao = sc.nextLine();
		
		CartaoBandeiraVisa visa = new CartaoBandeiraVisa();
		CartaoBanderiaMaster master = new CartaoBanderiaMaster(); 
		
		if (tipoPagamento.equalsIgnoreCase("Credito") && bandeiraCartao.equalsIgnoreCase("Visa")){
			visa.pagamentoCredito(); 
		} else if(tipoPagamento.equalsIgnoreCase("Debito") && bandeiraCartao.equalsIgnoreCase("Visa")) {
			visa.pagamentoDebito();
		} else if(tipoPagamento.equalsIgnoreCase("Credito") && bandeiraCartao.equalsIgnoreCase("Master")) {
			master.pagamentoCredito();
		} else if(tipoPagamento.equalsIgnoreCase("Debito") && bandeiraCartao.equalsIgnoreCase("Master")) {
			master.pagamentoDebito();
		}
		
		sc.close();

	}

}
