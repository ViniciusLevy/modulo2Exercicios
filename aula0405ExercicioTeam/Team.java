package modulo2Exercicios.aula0405ExercicioTeam;

import java.util.ArrayList;

public class Team {

    ArrayList<Player> teamList;

    Team() {
        teamList = new ArrayList<>();
    }

    Team(ArrayList<Player> teamList) {
        this.teamList = teamList;
    }

    public void addPlayer(Player player){
        teamList.add(player);
    }


}
