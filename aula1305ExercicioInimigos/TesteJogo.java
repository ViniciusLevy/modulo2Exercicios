package modulo2Exercicios.aula1305ExercicioInimigos;

public class TesteJogo {

    public static void main(String[] args) {

        Comum comum = new Comum();
        Cobra cobra = new Cobra();
        Vampiro vampiro = new Vampiro();
        Gigante gigante = new Gigante();

        comum.atacar();
        comum.apanhar(15);
        comum.interagir();

        cobra.atacar();
        cobra.apanhar(Ataque.PANCADA, 10);
        cobra.interagir();

        vampiro.atacar();
        vampiro.apanhar(Ataque.PERFURANTE, 15);
        vampiro.interagir();

        gigante.atacar();
        gigante.apanhar(Ataque.FOGO, 10);
        gigante.interagir();

    }
}
