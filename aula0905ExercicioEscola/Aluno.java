package modulo2Exercicios.aula0905ExercicioEscola;


import java.util.List;

public class Aluno extends Pessoa{

    int idade;
    String turma;
    List<Disciplina> notas;

    public Aluno(){

    }

    public Aluno(String nome, String cpf, String rg, int idade, String turma, List<Disciplina> disciplinas) {
        super(nome, cpf, rg);
        this.idade = idade;
        this.turma = turma;
        this.notas = disciplinas;
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

    public List<Disciplina> getNotas() {
        return notas;
    }

    public void setNotas(List<Disciplina> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome ='" + nome + '\'' +
                ", cpf ='" + cpf + '\'' +
                ", rg ='" + rg + '\'' +
                '}';
    }
}
