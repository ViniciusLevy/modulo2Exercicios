package modulo2Exercicios.aula0405ExercicioTeam;

import java.time.LocalDate;
import java.util.Random;

class Player {

    Integer id;
    String name;
    String nickName;
    LocalDate dateOfBirth;
    Integer number;
    String position;
    Double quality;
    Integer yellowCards;
    Integer redCard;
    Boolean suspended = false;
    int alreadyTrained = 0;

    Player() {

    }

    public Player(Integer id, String name, String nickName, LocalDate dateOfBirth, Integer number, String position,
                  Double quality, Integer yellowCards, Integer redCard) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
        this.dateOfBirth = dateOfBirth;
        this.number = number;
        this.position = position;
        this.quality = quality;
        this.yellowCards = yellowCards;
        this.redCard = redCard;
    }

    public boolean verifyGameCondition() {
        if (yellowCards == 3 || redCard == 1) {
            suspended = true;
        }
        return suspended;
    }

    public void applyYellowCard(int quantity) {
        this.yellowCards += quantity;
        verifyGameCondition();
        System.out.println("YELLOW CARD APPLIED TO - NUMBER OF YELLOW CARDS: " + quantity + "\n");
    }

    public void applyRedCard() {
        this.redCard = 1;
        verifyGameCondition();
        System.out.println("RED CARD APPLIED\n");

    }

    public void fulfillSuspension() {
        System.out.println("PLAYER FULFILLED THE SUSPENSION, CLEAR TO PLAY\n");
        yellowCards = 0;
        redCard = 0;
        suspended = false;
    }

    public void getInjuried() {
        System.out.println("PLAYER INJURIED\n");
        Random random = new Random();
        int randomValue = random.nextInt(100);
        if (randomValue <= 4) {
            quality = (quality - (quality * 0.15));
        } else if (randomValue <= 10) {
            quality = (quality - (quality * 0.10));
        } else if (randomValue <= 14) {
            quality = (quality - (quality * 0.05));
        } else if (randomValue <= 29) {
            if (quality <= 2) {
                quality -= 2;
            }
        } else if (randomValue <= 39) {
            if (quality <= 1) {
                quality -= 1;
            }
        }
    }

    public void gameDay() {
        System.out.println("GAME DAY\n");
        if (alreadyTrained == 1) {
            alreadyTrained = 0;
        }
    }

    public void getTrainning() {
        Random random = new Random();
        int randomValue = random.nextInt(2);

        if (alreadyTrained == 0) {
            System.out.println("TRAINING SESSION\n");
            if (randomValue == 0) {
                quality += 1;
                alreadyTrained++;
            } else if (randomValue == 1) {
                quality += 2;
                alreadyTrained++;
            } else {
                quality += 3;
                alreadyTrained++;
            }
        } else {
            System.out.println("PLAYER ALREADY TRAINED, NEXT TRAINING AFTER MATCH\n");
        }
    }

    @Override
    public String toString() {
        return this.position + ": - " + this.number +  " - " + this.name + "(" + this.nickName + ") - " +
                this.dateOfBirth + " " + "CONDITION: " + (verifyGameCondition() ? "CAN'T PLAY\n" : "CAN PLAY\n");
    }
}
