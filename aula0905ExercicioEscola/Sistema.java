package modulo2Exercicios.aula0905ExercicioEscola;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static void main(String[] args) {

        Escola escola = new Escola();

        List<Aluno> alunos = new ArrayList<>();
        List<Funcionario> funcionarios = new ArrayList<>();
        List<Professor> professores = new ArrayList<>();

        Aluno aluno1 = new Aluno("Jose", "www", "www", 15, "A", new ArrayList<>());

        Funcionario funcionario1 = new Funcionario("Roberto", "222", "111", "Cordenador", 7000);

        Professor professor1 = new Professor("Paulo", "111", "222", 5000, new ArrayList<>(), new ArrayList<>());

        escola.adicionaAluno(aluno1);
        escola.adicionaFuncionario(funcionario1);
        escola.adicionaProfessor(professor1);

        System.out.println(aluno1);
        System.out.println(funcionario1);
        System.out.println(professor1);
    }


}
