package modulo2Exercicios.aula1305ExercicioInimigos;

public class Personagem {

    private String nome;
    protected int hpPersonagem;
    private boolean isDead;


    public Personagem() {
        this.hpPersonagem = 100;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean verificaSeEstaMorto() {
        if(hpPersonagem > 0) {
            this.isDead = false;
            return false;
        }
        this.isDead = true;
        return true;
    }


}
