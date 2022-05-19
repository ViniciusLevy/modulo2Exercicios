package modulo2Exercicios.aula0405ExercicioTeam;

import java.time.LocalDate;

public class TestPlayer {

    public static void main(String[] args) {

        Team myTeam = new Team();

        LocalDate localDate1 = LocalDate.of(1976, 11, 17);

        Player player1 = new Player(1, "José", "Jô", localDate1, 1,
                "Goalkeeper", 5.0, 0, 0);

        LocalDate localDate2 = LocalDate.of(1989, 12, 10);
        Player player2 = new Player(2, "Roberto", "Rô", localDate2, 2,
                "Defender", 6.0, 0, 0);

        LocalDate localDate3 = LocalDate.of(1979, 1, 11);
        Player player3 = new Player(3, "Carlos", "Ca", localDate3, 3,
                "Defender", 3.0, 0, 0);

        LocalDate localDate4 = LocalDate.of(1991, 7, 21);
        Player player4 = new Player(4, "Eduardo", "Dudu", localDate4, 4,
                "Right-Wing", 6.5, 0, 0);

        LocalDate localDate5 = LocalDate.of(1992, 4, 12);
        Player player5 = new Player(5, "Maycon", "May", localDate5, 5,
                "Left-Wing", 5.0, 0, 0);

        LocalDate localDate6 = LocalDate.of(1994, 2, 16);
        Player player6 = new Player(6, "Túlio", "Lio", localDate6, 6,
                "Midfielder", 4.0, 0, 0);

        LocalDate localDate7 = LocalDate.of(1995, 1, 13);
        Player player7 = new Player(7, "Jonas", "Nas", localDate7, 7,
                "Midfielder", 8.0, 0, 0);

        LocalDate localDate8 = LocalDate.of(1994, 6, 6);
        Player player8 = new Player(8, "Nicolas", "Nick", localDate8, 8,
                "Midfielder", 6.5, 0, 0);

        LocalDate localDate9 = LocalDate.of(1978, 12, 4);
        Player player9 = new Player(9, "Claiton", "Ton", localDate9, 9,
                "Midfielder", 8.0, 0, 0);

        LocalDate localDate10 = LocalDate.of(1993, 5, 25);
        Player player10 = new Player(10, "Ronaldo", "Fenômeno", localDate10, 10,
                "Striker", 9.5, 0, 0);

        LocalDate localDate11 = LocalDate.of(1971, 6, 24);
        Player player11 = new Player(11, "Romário", "Baixinho", localDate11, 11,
                "Striker", 9.3, 0, 0);

        myTeam.addPlayer(player1);
        myTeam.addPlayer(player2);
        myTeam.addPlayer(player3);
        myTeam.addPlayer(player4);
        myTeam.addPlayer(player5);
        myTeam.addPlayer(player6);
        myTeam.addPlayer(player7);
        myTeam.addPlayer(player8);
        myTeam.addPlayer(player9);
        myTeam.addPlayer(player10);
        myTeam.addPlayer(player11);

        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
        System.out.println(player4);
        System.out.println(player5);
        System.out.println(player6);
        System.out.println(player7);
        System.out.println(player8);
        System.out.println(player9);
        System.out.println(player10);
        System.out.println(player11);

        player1.applyYellowCard(3);
        System.out.println(player1);

        player1.fulfillSuspension();
        System.out.println(player1);

        player1.getInjuried();
        System.out.println("Quality of: "+ player1.name + " - " + player1.quality + "\n");

        player1.getTrainning();
        System.out.println("Quality of: "+ player1.name + " - " + player1.quality + "\n");

        player1.getTrainning();
        player1.gameDay();

        player1.getTrainning();
        System.out.println("Quality of: "+ player1.name + " - " + player1.quality + "\n");

    }
}
