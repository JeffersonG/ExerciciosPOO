package Exercicio2;

public class Fruta extends ProdutoPerecivel {

	public Fruta (){
		super(" Não Informado", 0, 0);
	}
	
	public Fruta (String nome, int id, float preco){
		super.nome = nome;
		super.id = id;
		super.preco = preco;
	}
}
