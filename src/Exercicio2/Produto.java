package Exercicio2;

public class Produto {
	
	String nome;
	int id;
	Double preco;
	
	public Produto (){
		this(" N�o Infomado", 0 , 0.0 );
	}
	
	public Produto (String nome, int id, Double preco){
		this.nome = nome;
		this.id = id;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	

}
