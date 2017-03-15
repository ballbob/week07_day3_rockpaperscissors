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
            return "Player wins!";
        }
        if (playerInput == ROCK && compInput == PAPER){
            return "Computer wins!";
        }
        if (playerInput == ROCK && compInput == LIZARD){
            return "Player wins!";
        }
        if (playerInput == ROCK && compInput == SPOCK){
            return "Computer wins!";
        }

        if (playerInput == PAPER && compInput == ROCK){
            return "Player wins!";
        }
        if (playerInput == PAPER && compInput == SCISSORS){
            return "Computer wins!";
        }
        if (playerInput == PAPER && compInput == LIZARD){
            return "Computer wins!";
        }
        if (playerInput == PAPER && compInput == SPOCK){
            return "Player wins!";
        }


        if (playerInput == SCISSORS && compInput == ROCK){
            return "Computer wins!";
        }
        if (playerInput == SCISSORS && compInput == PAPER){
            return "Player wins!";
        }
        if (playerInput == SCISSORS && compInput == LIZARD){
            return "Player wins!";
        }
        if (playerInput == SCISSORS && compInput == SPOCK){
            return "Computer wins!";
        }


        if (playerInput == LIZARD && compInput == ROCK){
            return "Computer wins!";
        }
        if (playerInput == LIZARD && compInput == PAPER){
            return "Player wins!";
        }
        if (playerInput == LIZARD && compInput == SCISSORS){
            return "Computer wins!";
        }
        if (playerInput == LIZARD && compInput == SPOCK){
            return "Player wins!";
        }


        if (playerInput == SPOCK && compInput == ROCK){
            return "Player wins!";
        }
        if (playerInput == SPOCK && compInput == PAPER){
            return "Computer wins!";
        }
        if (playerInput == SPOCK && compInput == SCISSORS){
            return "Player wins!";
        }
        if (playerInput == SPOCK && compInput == LIZARD){
            return "Computer wins!";
        }

        else {
            return "Draw!";
        }
    }
}
