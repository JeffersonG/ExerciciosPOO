
package poo.sca.io;
import poo.sca.*;
import java.util.*;

public interface SCAPersistencia {
		
	public void salvarTurma(Turma turma) throws SCAPersistenciaException;
	public List <Turma> recuperarTurmas()throws SCAPersistenciaException;
	public void salvarDisciplina(Disciplina disciplina)throws SCAPersistenciaException;
	public List <Disciplina> recuperarDisciplinas() throws SCAPersistenciaException;
	public void salvarProfessor(Professor professor)throws SCAPersistenciaException;
	public List <Professor> recuperarProfessores()throws SCAPersistenciaException;
	public void salvarCurso(Curso curso)throws SCAPersistenciaException;
	public List <Curso> recuperarCursos()throws SCAPersistenciaException;
	}