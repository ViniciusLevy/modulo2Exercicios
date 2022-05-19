package modulo2Exercicios.aula0905ExercicioEscola;

public class Funcionario extends Pessoa {

    String cargo;
    double salario;

    public Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo ='" + cargo + '\'' +
                ", salario =" + salario +
                '}';
    }
}
