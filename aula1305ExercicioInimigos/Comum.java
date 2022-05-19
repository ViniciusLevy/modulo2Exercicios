package modulo2Exercicios.aula1305ExercicioInimigos;

public class Comum extends Inimigo{

    protected int vida;

    public Comum() {
        this.vida = 100;
    }

    @Override
    public void atacar() {
        System.out.println("HP Personsagem: " +  this.personagem.hpPersonagem);

        System.out.println("Inimigo Comum realizou um ataque!");
        System.out.println("Dano: 10 HP");

        this.personagem.hpPersonagem -= 10;

        System.out.println("HP Personagem: " + this.personagem.hpPersonagem);

    }

    @Override
    public void apanhar(int dano) {
        this.dano = dano;
        System.out.println("HP Inimigo Comum: " + this.vida);

        System.out.println("Ataque realizado pelo personagem!");
        System.out.println("Dano " + dano);

        this.vida -= dano;

        System.out.println("HP Inimigo Comum: " + this.vida);
        System.out.println();

    }

    @Override
    public void apanhar(Ataque ataque, int dano){

    }

    @Override
    public void interagir() {
        System.out.println("Inimigo Comum: Porque eu responderia meu inimigo???\n");
    }
}
