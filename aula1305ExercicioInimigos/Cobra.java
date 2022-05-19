package modulo2Exercicios.aula1305ExercicioInimigos;

public class Cobra extends Comum{

    public Cobra() {
        this.vida = 100;
    }

    @Override
    public void atacar() {
        System.out.println("HP Personsagem: " +  this.personagem.hpPersonagem);

        System.out.println("Inimigo Cobra realizou um ataque!");
        System.out.println("Dano: 10 HP");
        System.out.println("Seu personagem está envenenado");

        this.personagem.hpPersonagem -= 10;

        System.out.println("HP Personagem: " + this.personagem.hpPersonagem);
        System.out.println();

    }

    @Override
    public void apanhar(Ataque ataque, int dano) {
        this.dano = dano;
        System.out.println("HP Inimigo Cobra: " + this.vida);
        System.out.println("Ataque realizado pelo personagem!");

        if (ataque == Ataque.PANCADA) {
            System.out.println("Ataque Pancada, dano em dobro!");
            System.out.println("Inimigo Cobra recebeu " + (dano * 2) + " de dano");
            this.vida -= dano * 2;
            System.out.println("HP Inimigo Cobra: " + this.vida);
        } else {
            System.out.println("Ataque Comum");
            System.out.println("Inimigo Cobra recebeu " + dano + " de dano");
            this.vida -= dano;
            System.out.println("HP Inimigo Cobra: " + this.vida);
        }
        System.out.println();
    }

    @Override
    public void interagir() {
        System.out.println("Inimigo Cobra: Se você acender a chama a maldição acaba.\n");
    }
}
