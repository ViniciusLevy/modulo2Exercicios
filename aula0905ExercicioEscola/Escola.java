package modulo2Exercicios.aula0905ExercicioEscola;

import java.util.ArrayList;
import java.util.List;

public class Escola {

    List<Aluno> alunos;
    List<Funcionario> funcionarios;
    List<Professor> professores;

    public Escola() {
        this.alunos = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public void adicionaAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionaFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionaProfessor(Professor professor) {
        professores.add(professor);
    }
}
