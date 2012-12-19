package Exercicio2;

public class ProdutoNaoPerecivel extends Produto {

	public ProdutoNaoPerecivel(){
		super("Não Informado", 0, 0);
	}
	
	public ProdutoNaoPerecivel(String nome, int id, float preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
	}
	
}
