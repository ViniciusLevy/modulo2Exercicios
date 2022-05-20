package modulo2Exercicios.aula0905ExercicioEscola;

public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;

    public Pessoa(String nome, String cpf, String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public void imprimePessoa() {
        System.out.println("\nNome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("RG: " + getRg());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
