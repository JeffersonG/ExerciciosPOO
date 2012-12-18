package poo.sca;

import java.util.*;
import poo.sca.io.SCAPersistencia;
import poo.sca.io.SCAPersistenciaException;
import poo.sca.io.SCAPersistenciaMemoria;

public class SCAFacade {
	
	private  SCAPersistencia  persistencia ;

	public  SCAFacade () {
		persistencia  =  new  SCAPersistenciaMemoria ();
	}

	public Turma criarTurma (Disciplina disciplina, int numero, String periodo) throws SCAPersistenciaException{
		Turma turma = new Turma (disciplina, numero, periodo);
		persistencia.salvarTurma(turma);
		return turma;
	}
	
	 public Turma getTurma (String periodo, int codDisciplina, int numero) throws SCAPersistenciaException{
		
		 for (Turma turma : persistencia.recuperarTurmas()){
			 if (turma.getPeriodo().equals(periodo)){
				 if (turma.getNumero() == numero){
					 if (turma.getDisciplina().getCodigo() == codDisciplina){
						 return turma;
					 }
				 }
			 }
		 }
		 
		 return null;
	}
	
	public Turma removeTurma(String periodo, int codDisciplina, int numero) throws SCAPersistenciaException{
		
		 for (Turma turma : persistencia.recuperarTurmas()){
			 if (turma.getPeriodo().equals(periodo)){
				 if (turma.getNumero() == numero){
					 if (turma.getDisciplina().getCodigo() == codDisciplina){
						 Turma aux = turma;
						 turma = null;
						 return aux;
					 }
				 }
			 }
		 }
		 
		 return null;
	} 
	
	public Iterator<Turma> getTurmasIterator() throws SCAPersistenciaException{
		Iterator<Turma> turmas = persistencia.recuperarTurmas().iterator();
		return turmas;
	}
	
	public Curso criarCurso (String nome, int codigo) throws SCAPersistenciaException{
		Curso curso = new Curso (codigo, nome);
		persistencia.salvarCurso(curso);
		return curso;
	}
	
	public Iterator<Curso> getCursosIterator() throws SCAPersistenciaException{
		Iterator<Curso> cursos = persistencia.recuperarCursos().iterator();
		return cursos;
	}
	
	public Disciplina criarDisciplina ( String  nome ,  int  codigo ) throws SCAPersistenciaException  {
		Disciplina  disciplina  =  new  Disciplina ( codigo , nome );
		persistencia.salvarDisciplina(disciplina);
		return  disciplina ;
	}
	
	public Iterator<Disciplina> getDisciplinasIterator() throws SCAPersistenciaException{
		Iterator<Disciplina> disciplinas = persistencia.recuperarDisciplinas().iterator();
		return disciplinas;
	}
	
	public Professor criarProfessor (String nome, int matricula) throws SCAPersistenciaException{
		Professor professor = new Professor(matricula, nome);
		persistencia.salvarProfessor(professor);
		return professor;
	}
	
	public Iterator<Professor> getProfessoresIterator() throws SCAPersistenciaException{
		Iterator<Professor> professores = persistencia.recuperarProfessores().iterator();
		return professores;
	}

}
