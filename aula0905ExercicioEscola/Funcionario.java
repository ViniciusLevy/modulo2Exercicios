package modulo2Exercicios.aula0905ExercicioEscola;

public class Funcionario extends Pessoa{

    private String cargo;
    private double salario;

    Funcionario(String nome, String cpf, String rg, String cargo, double salario) {
        super(nome, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }

    public void imprimeFuncionario() {
        imprimePessoa();
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salario: " + getSalario());
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
    public String toString(){
        return "\nNome: " + getNome() + " CPF: " + getCpf() + " RG: " + getRg() + " Cargo: " + getCargo() + " Salário: "
                + getSalario();
    }
}
