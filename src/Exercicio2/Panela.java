package Exercicio2;

public class Panela extends ProdutoNaoPerecivel {
	
	public Panela(){
		super("Não Informado", 0, 0);
	}

	public Panela (String nome, int id, float preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
	}
}
