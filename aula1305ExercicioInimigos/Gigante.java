package modulo2Exercicios.aula1305ExercicioInimigos;

public class Gigante extends Comum{


    public Gigante() {
        this.vida = 100;
    }

    @Override
    public void atacar() {
        System.out.println("HP Personsagem: " +  this.personagem.hpPersonagem);

        System.out.println("Inimigo Gigante realizou um ataque!");
        System.out.println("Dano: 25 HP");
        System.out.println("Seu personagem está atordoado");

        this.personagem.hpPersonagem -=25;

        System.out.println("HP Personagem: " + this.personagem.hpPersonagem);
        System.out.println();
    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        this.dano = dano;
        System.out.println("HP Inimigo Gigante: " + this.vida);
        System.out.println("Ataque realizado pelo personagem!");

        if (ataque == Ataque.FOGO) {
            System.out.println("Ataque de Fogo, dano em dobro!");
            System.out.println("Inimigo Gigante recebeu " + (dano * 2) + " de dano");
            this.vida -= dano * 2;
            System.out.println("HP Inimigo Gigante: " + this.vida);
        } else {
            System.out.println("Ataque Comum");
            System.out.println("Inimigo Gigante recebeu " + dano + " de dano");
            this.vida -= dano;
            System.out.println("HP Inimigo Giganto: " + this.vida);
        }
        System.out.println();
    }

    @Override
    public void interagir() {
        System.out.println("Inimigo Gigante: Me desculpe\n");
    }
}
