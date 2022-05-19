package modulo2Exercicios.aula1305ExercicioInimigos;

public abstract class Inimigo {

    protected int dano;
    protected Personagem personagem = new Personagem();

    public abstract void atacar();

    public abstract void apanhar(int dano);

    public abstract void apanhar(Ataque ataque, int dano);

    public abstract void interagir();
}
