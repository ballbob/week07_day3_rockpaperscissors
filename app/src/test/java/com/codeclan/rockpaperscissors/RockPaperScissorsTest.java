package com.codeclan.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static com.codeclan.rockpaperscissors.Weapon.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


/**
 * Created by user on 15/03/2017.
 */

public class RockPaperScissorsTest {

    RockPaperScissors game;
    RockPaperScissors riggedgame;

    @Before
    public void before(){
        game = new RockPaperScissors(ROCK);
        riggedgame = new RockPaperScissors(SCISSORS,ROCK);
    }

    @Test
    public void canGetPlayerInput(){
        assertEquals(ROCK, game.getPlayerInput());
    }


    @Test
    public void canGenerateAndGetCompInput(){
        assertNotNull(game.getCompInput());
    }

    @Test
    public void canRigGame(){
        assertEquals(ROCK,riggedgame.getCompInput());
    }

    @Test
    public void canCompWinGame(){
        assertEquals("Computer wins!",riggedgame.play());
    }

    @Test
    public void canPlayerWinGame(){
        riggedgame = new RockPaperScissors(PAPER,ROCK);
        assertEquals("Player wins!", riggedgame.play());
    }

    @Test
    public void canDrawGame(){
        riggedgame = new RockPaperScissors(ROCK, ROCK);
        assertEquals("Draw!", riggedgame.play());
    }

    @Test
    public void getWeaponFromString(){
        Weapon expected = ROCK;
        assertEquals(expected, Weapon.valueOf("ROCK"));
    }
}
