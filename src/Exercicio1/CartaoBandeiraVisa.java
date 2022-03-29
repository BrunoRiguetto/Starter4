package Exercicio1;

public class CartaoBandeiraVisa implements PagamentoCartao{
	
	private String pagamento;	

	public CartaoBandeiraVisa() {
	}

	public CartaoBandeiraVisa(String pagamento) {
		this.pagamento = pagamento;
	}	

	public String getPagamento() {
		return pagamento;
	}

	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public void pagamentoDebito() {
		System.out.println("D�bito, pago com Visa");
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Cr�dito, pago com Visa");
	}	

}
