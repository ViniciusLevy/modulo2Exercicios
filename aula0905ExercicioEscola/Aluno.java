package modulo2Exercicios.aula0905ExercicioEscola;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{

    private int idade;
    private String turma;
    private List<Integer> listaNotas;



    public Aluno(String nome, String cpf, String rg, int idade, String turma) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.listaNotas = new ArrayList<>();
    }

    public void adicionaNota(int nota) {
        listaNotas.add(nota);
    }

    public int mediaNotas() {
        int total = 0;

        for (Integer nota: listaNotas) {
            total += nota;
        }
        return total / listaNotas.size();
    }

    public void imprimeAluno() {
        imprimePessoa();
        List<Integer> lista = new ArrayList<>();
        System.out.println("Idade: " + getIdade());
        System.out.println("Turma: " + getTurma());
        System.out.println("Notas: ");
        for (Integer nota: listaNotas) {
            lista = getListaNotas();
        }
        System.out.println("Nota: " + lista);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Integer> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(List<Integer> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "\nNome: " + getNome() + " CPF: " + getCpf() + " RG: " + getRg() + " Idade: " + getIdade()
              + " Turma " + getTurma() + " Notas " + getListaNotas();
    }
}
