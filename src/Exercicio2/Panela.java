package Exercicio2;

public class Panela extends ProdutoNaoPerecivel {
	
	public Panela(){
		super("N�o Informado", 0, 0.0);
	}

	public Panela (String nome, int id, Double preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
	}
}
