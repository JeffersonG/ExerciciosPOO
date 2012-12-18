package poo.sca;
import java.util.*;
public class Turma {

	private Disciplina disciplina;
	private List <Professor> professores = new Vector <Professor>();
	private String horario;
	private List <Curso> cursos = new Vector <Curso>();
	private int numero;
	private String periodo;
	
	public Turma (Disciplina disciplina, int numero, String periodo ){
	
		this.setDisciplina(disciplina);
		this.setNumero(numero);
		this.setPeriodo(periodo);
	
	}
	
	public void addProfessor (Professor professor){
		professores.add(professor);
	}
	
	public Iterator<Professor> getProfessoresIterator (){
		Iterator<Professor> profs = professores.iterator();
		return profs;
		}
	
	public void addCurso (Curso curso){
		cursos.add(curso);
	}
		
	public Iterator<Curso> getTurmasIterator (){
		Iterator<Curso> curs = cursos.iterator();
		return curs;
		}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	}

