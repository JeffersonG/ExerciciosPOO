package Exercicio2;

public class Carne extends ProdutoPerecivel {
	
	public Carne (){
		super (" N�o Informado", 0, 0.0);
	}
	
	public Carne (String nome, int id, Double preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
	}
}
