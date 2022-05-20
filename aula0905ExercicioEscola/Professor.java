package modulo2Exercicios.aula0905ExercicioEscola;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario{

    private List<String> turmas;


    public Professor(String nome, String cpf, String rg, double salario) {
        super(nome, cpf, rg, "Professor", salario);
        this.turmas = new ArrayList<>();

    }

    public void adicionaTurma() {
        this.turmas = getTurmas();
    }
    public void imprimeProfessor() {
        imprimeFuncionario();
        System.out.println("Turmas: " + getTurmas());
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + getNome() + " CPF: " + getCpf() + " RG: " + getRg() + " Cargo: " + getCargo() + " Salário: "
                + getSalario() + "Turmas: " + turmas;
    }
}
