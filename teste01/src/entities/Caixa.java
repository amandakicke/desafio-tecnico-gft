package entities;

public class Caixa extends Produto {

	private String produto;
	private int quantidade;
	
	public Caixa(String nome, double valor, int tipo) {
		super(nome, valor, tipo);
		
	}
	
	
	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public double calculaValorFina(){
		return this.produto - 10/100 this
	}
}
