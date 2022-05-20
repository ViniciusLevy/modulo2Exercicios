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

    public void adicionarAluno(Aluno aluno) {
        if (!this.alunos.contains(aluno)) {
            alunos.add(aluno);
        }
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (!this.funcionarios.contains(funcionario)) {
            funcionarios.add(funcionario);
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (!this.professores.contains(professor)) {
            professores.add(professor);
        }
    }

    public int acharIndexAluno(String cpf) {
        for (Aluno aluno: alunos) {
            if(aluno.getCpf().equals(cpf)) {
                return alunos.indexOf(aluno);
            }
        }
        return -1;
    }

    public int acharIndexFuncionario(String cpf) {
        for (Funcionario funcionario: funcionarios) {
            if(funcionario.getCpf().equals(cpf)) {
                return funcionarios.indexOf(funcionario);
            }
        }
        return -1;
    }

    public int acharIndexProfessor(String cpf) {
        for (Professor professor: professores) {
            if(professor.getCpf().equals(cpf)) {
                return professores.indexOf(professor);
            }
        }
        return -1;
    }

    public void atualizaAluno(String nome, String cpf, String rg, int idade, String turma) {
        int index = acharIndexAluno(cpf);
        if( index == -1) {
            System.out.println("Aluno não cadastrado");
        } else {
            this.alunos.get(index).setNome(nome);
            this.alunos.get(index).setCpf(cpf);
            this.alunos.get(index).setRg(rg);
            this.alunos.get(index).setIdade(idade);
            this.alunos.get(index).setTurma(turma);
            System.out.println("Aluno Atualizado!");
        }
    }

    public void atualizaFuncionario(String nome, String cpf, String rg, String cargo, double salario) {
        int index = acharIndexFuncionario(cpf);
        if( index == -1) {
            System.out.println("Funcionário não cadastrado");
        } else {
            this.funcionarios.get(index).setNome(nome);
            this.funcionarios.get(index).setCpf(cpf);
            this.funcionarios.get(index).setRg(rg);
            this.funcionarios.get(index).setCargo(cargo);
            this.funcionarios.get(index).setSalario(salario);
            System.out.println("Funcionario Atualizado!");
        }
    }

    public void atualizaProfessor(String nome, String cpf, String rg, double salario, List<String> turmas) {
        int index = acharIndexProfessor(cpf);
        if( index == -1) {
            System.out.println("Professor não cadastrado");
        } else {
            this.professores.get(index).setNome(nome);
            this.professores.get(index).setCpf(cpf);
            this.professores.get(index).setRg(rg);
            this.professores.get(index).setSalario(salario);
            this.professores.get(index).setTurmas(turmas);
            System.out.println("Professor Atualizado!");
        }
    }

    public void deletaAluno(String cpf) {
        int indexAluno = acharIndexAluno(cpf);
        if (indexAluno != -1) {
            alunos.remove(indexAluno);
            System.out.println("Aluno removido!");
        }
    }

    public void deletaFuncionario(String cpf) {
        int indexFuncionario = acharIndexFuncionario(cpf);
        if (indexFuncionario != -1) {
            funcionarios.remove(indexFuncionario);
            System.out.println("Funcionário removido!");
        }
    }

    public void deletaProfessor(String cpf) {
        int indexProfessor = acharIndexProfessor(cpf);
        if (indexProfessor != -1) {
            professores.remove(indexProfessor);
            System.out.println("Professor removido!");
        }
    }


}
