package Exercicio1;

public class CartaoBanderiaMaster implements PagamentoCartao{

	private String pagamento;
	
	public CartaoBanderiaMaster() {
	}

	public CartaoBanderiaMaster(String pagamento) {
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
		System.out.println("D�bito, pago com Master");
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Cr�dito, pago com Master");
	}

}
