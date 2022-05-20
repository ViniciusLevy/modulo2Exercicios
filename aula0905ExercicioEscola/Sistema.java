package modulo2Exercicios.aula0905ExercicioEscola;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public static void main(String[] args) {
        Escola escola = new Escola();


        Aluno aluno1 = new Aluno("João", "www1", "xxx", 10, "Turma 1A");
        Aluno aluno2 = new Aluno("Marcos", "www2", "xxx", 12, "Turma 2A");
        Aluno aluno3 = new Aluno("Maria", "www3", "xxx", 13, "Turma 3A");

        List<Integer> listaNotas = new ArrayList<>();

        aluno1.adicionaNota(10);
        aluno1.adicionaNota(2);
        aluno1.adicionaNota(3);


        Funcionario funcionario1 = new Funcionario("Roberta", "www", "xxx", "Diretora", 10000);

        Professor professor1 = new Professor("Juliana", "www", "xxx", 8000);
        professor1.adicionaTurma();

        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarAluno(aluno3);
        escola.adicionarFuncionario(funcionario1);

        escola.adicionarProfessor(professor1);

        escola.deletaAluno("www3");

        System.out.println(funcionario1);

        escola.atualizaFuncionario("Roberta", "www", "xxx", "Diretora", 13000);

        System.out.println(funcionario1);

        aluno1.imprimeAluno();

        funcionario1.imprimeFuncionario();

        professor1.imprimeProfessor();

    }
}
