package com.codeclan.rockpaperscissors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

import static com.codeclan.rockpaperscissors.Weapon.*;

/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissors {

    Weapon playerInput;
    Weapon compInput;


    public RockPaperScissors(Weapon playerInput) {
        this.playerInput = playerInput;
        this.compInput = generateCompInput();
    }

    public RockPaperScissors(Weapon playerInput, Weapon compInput){
        this.playerInput = playerInput;
        this.compInput = compInput;
    }

    public Weapon getPlayerInput() {
        return playerInput;

    }

    public Weapon generateCompInput() {
        Weapon[] valuesArray = Weapon.values();
        Collections.shuffle(Arrays.asList(valuesArray));
        return valuesArray[0];
    }

    public Weapon getCompInput() {
        return compInput;
    }

    public String play() {

        if (playerInput == ROCK && compInput == SCISSORS){
            return "Rock smashes scissors. Player wins!";
        }
        if (playerInput == ROCK && compInput == PAPER){
            return "Paper traps rock. Computer wins!";
        }
        if (playerInput == ROCK && compInput == LIZARD){
            return "Rock crushes lizard. Player wins!";
        }
        if (playerInput == ROCK && compInput == SPOCK){
            return "Spock vaporises rock. Computer wins!";
        }


        if (playerInput == PAPER && compInput == ROCK){
            return "Paper traps rock. Player wins!";
        }
        if (playerInput == PAPER && compInput == SCISSORS){
            return "Scissors slice paper. Computer wins!";
        }
        if (playerInput == PAPER && compInput == LIZARD){
            return "Lizard eats paper. Computer wins!";
        }
        if (playerInput == PAPER && compInput == SPOCK){
            return "Spock is, for some reason, weak to paper. Player wins!";
        }


        if (playerInput == SCISSORS && compInput == ROCK){
            return "Rock smashes scissors. Computer wins!";
        }
        if (playerInput == SCISSORS && compInput == PAPER){
            return "Scissors slice paper. Player wins!";
        }
        if (playerInput == SCISSORS && compInput == LIZARD){
            return "Scissors decapitate lizard. Player wins!";
        }
        if (playerInput == SCISSORS && compInput == SPOCK){
            return "Spock smashes scissors. Computer wins!";
        }


        if (playerInput == LIZARD && compInput == ROCK){
            return "Rock crushes lizard. Computer wins!";
        }
        if (playerInput == LIZARD && compInput == PAPER){
            return "Lizard eats paper. Player wins!";
        }
        if (playerInput == LIZARD && compInput == SCISSORS){
            return "Scissors decapitate lizard. Computer wins!";
        }
        if (playerInput == LIZARD && compInput == SPOCK){
            return "Lizard poisons Spock. Player wins!";
        }


        if (playerInput == SPOCK && compInput == ROCK){
            return "Spock vaporises rock. Player wins!";
        }
        if (playerInput == SPOCK && compInput == PAPER){
            return "Spock is, for some reason, weak to paper. Computer wins!";
        }
        if (playerInput == SPOCK && compInput == SCISSORS){
            return "Spock smashes scissors. Player wins!";
        }
        if (playerInput == SPOCK && compInput == LIZARD){
            return "Lizard poisons Spock. Computer wins!";
        }

        else {
            return "Draw!";
        }
    }
}
