package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    TextView winnerText;
    TextView computerWeapon;
    TextView playerWeapon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String playerChoiceString = extras.getString("playerChoice");
        Weapon playerChoiceWeapon = Weapon.valueOf(playerChoiceString);


        RockPaperScissors game = new RockPaperScissors(playerChoiceWeapon);

        String displayedComputerWeapon = game.getCompInput().toString();
        String displayedPlayerWeapon = game.getPlayerInput().toString();

        String winnerTextString = game.play();

        winnerText = (TextView)findViewById(R.id.winner_text);
        winnerText.setText(winnerTextString);

        playerWeapon = (TextView)findViewById(R.id.player_weapon);
        computerWeapon = (TextView)findViewById(R.id.computer_weapon);

        playerWeapon.setText("The player chose " + displayedPlayerWeapon.toLowerCase() + "!");
        computerWeapon.setText("The computer chose " + displayedComputerWeapon.toLowerCase() + "!");
    }
}
