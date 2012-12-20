package Exercicio2;

public class ProdutoPerecivel extends Produto {

	String vencimento;
	
	public ProdutoPerecivel (){
		super("Não Informado", 0, 0.0);
	}
	
	public ProdutoPerecivel (String nome, int id, Double preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
		
	}

	public String getVencimento() {
		return vencimento;
	}

	public void setVencimento(String vencimento) {
		this.vencimento = vencimento;
	}
	
	
}
