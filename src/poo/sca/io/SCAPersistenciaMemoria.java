package poo.sca.io;
import java.util.*;
import poo.sca.*;


public class SCAPersistenciaMemoria implements SCAPersistencia {

	private List<Disciplina> disciplinas;
	private List<Turma> turmas;
	private List<Professor> professores;
	private List<Curso> cursos;
	
	public SCAPersistenciaMemoria (){
		this.disciplinas = new LinkedList<Disciplina>();
		this.turmas = new LinkedList<Turma>();
		this.professores = new LinkedList<Professor>();
		this.cursos = new LinkedList<Curso>();
	}
	
	public void salvarTurma(Turma turma) {
		this.turmas.add(turma);
	}

	public List<Turma> recuperarTurmas() {

		return turmas;
	}

	public void salvarDisciplina(Disciplina disciplina) {

		this.disciplinas.add(disciplina);
	}

	public List<Disciplina> recuperarDisciplinas() {

		return disciplinas;
	}

	public void salvarProfessor(Professor professor) {

		this.professores.add(professor);
	}

	public List<Professor> recuperarProfessores() {

		return professores;
	}

	public void salvarCurso(Curso curso) {
	
		this.cursos.add(curso);
	}

	public List<Curso> recuperarCursos() {
	
		return cursos;
	}

}