package poo.sca;

public class Disciplina {
 
	private int codigo;
	private String nome;
	
	public Disciplina (int cod, String nom){
		this.codigo = cod;
		this.nome = nom;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
