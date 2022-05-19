package modulo2Exercicios.aula1305ExercicioInimigos;

public class Vampiro extends Comum {

    public Vampiro() {
        this.vida = 100;
    }


    @Override
    public void atacar() {
        System.out.println("HP Personsagem: " +  this.personagem.hpPersonagem);

        System.out.println("Inimigo Vampiro realizou um ataque!");
        System.out.println("Dano: 20 HP");
        System.out.println("Seu personagem está sangrando");

        this.personagem.hpPersonagem -=20;

        System.out.println("HP Personagem: " + this.personagem.hpPersonagem);
        System.out.println();
    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        this.dano = dano;
        System.out.println("HP Inimigo Vampiro: " + this.vida);
        System.out.println("Ataque realizado pelo personagem!");

        if (ataque == Ataque.PERFURANTE) {
            System.out.println("Ataque Perfurante, dano em dobro!");
            System.out.println("Inimigo Vampiro recebeu " + (dano * 2) + " de dano");
            this.vida -= dano * 2;
            System.out.println("HP Inimigo Vampiro: " + this.vida);
        } else {
            System.out.println("Ataque Comum");
            System.out.println("Inimigo Vampiro recebeu " + dano + " de dano");
            this.vida -= dano;
            System.out.println("HP Inimigo Vampiro: " + this.vida);
        }
        System.out.println();
    }

    @Override
    public void interagir() {
        System.out.println("Inimigo Vampiro: O que é um homem?\n");
    }
}
