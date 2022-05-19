package modulo2Exercicios.aula0605ExercicioEstoque;

public class Produto {

    public String nome;
    private String marca;
    private String tipo;
    private String sessao;
    private int quantidadeEstoque;
    private int idEstoque;
    private static int contadorId = 0;


    public Produto() {
        inicializarId();
    }

    private void inicializarId() {
        contadorId++;
        this.idEstoque = contadorId;
    }

    public Produto(String nome, String marca, String tipo, String sessao, int quantidadeEstoque) {
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.sessao = sessao;
        this.quantidadeEstoque = quantidadeEstoque;
        inicializarId();
    }

    public int getIdEstoque() {
        return idEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
