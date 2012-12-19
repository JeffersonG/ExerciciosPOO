package Exercicio2;

public class Produto {
	
	String nome;
	int id;
	float preco;
	
	public Produto (){
		this(" Não Infomado", 0 , 0 );
	}
	
	public Produto (String nome, int id, float preco){
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

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
