package modulo2Exercicios.aula0905ExercicioEscola;


import java.util.List;

public class Professor extends Funcionario {

    List<String> turmas;
    List<Disciplina> disciplinas;

    public Professor(String nome, String cpf, String rg, double salario, List<String> turmas, List<Disciplina> disciplinas) {
        super(nome, cpf, rg, "Professor", salario);
        this.turmas = turmas;
        this.disciplinas = disciplinas;
    }

    public List<String> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<String> turmas) {
        this.turmas = turmas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "turmas =" + turmas +
                ", disciplinas =" + disciplinas +
                '}';
    }
}
