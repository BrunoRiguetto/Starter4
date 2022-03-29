package Exercicio3;

public class Produto {
	
	private String descricao;
	private Double valorReal;
	private char operacao;
	private Double percentual;
	private Double valorFinal;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorReal() {
		return valorReal;
	}

	public void setValorReal(Double valorReal) {
		this.valorReal = valorReal;
	}

	public char getOperacao() {
		return operacao;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Produto(String descricao, Double valorReal, char operacao, Double percentual) {
		super();
		this.descricao = descricao;
		this.valorReal = valorReal;
		this.operacao = operacao;
		this.percentual = percentual;
	
	}
	
	public Double operacao(double valorReal, double percentual) {
		if (operacao == 'd') {
			valorFinal = valorReal - (valorReal * (percentual / 100)) ;
		} else if (operacao == 'a') {
			valorFinal = valorReal * (percentual / 100) + valorReal;
		}
		
		return valorFinal;
	}
	
	
}
