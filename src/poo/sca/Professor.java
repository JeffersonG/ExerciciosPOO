package poo.sca;

public class Professor {

	private int matricula;
	private String nome;
	
	public Professor (int matri, String nom){
		this.matricula = matri;
		this.nome = nom;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
