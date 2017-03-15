package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.codeclan.rockpaperscissors.Weapon.*;

public class RPSActivity extends AppCompatActivity {

    Button rock;
    Button paper;
    Button scissors;
    Button lizard;
    Button spock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        rock = (Button)findViewById(R.id.rockButton);
        paper = (Button)findViewById(R.id.paperButton);
        scissors = (Button)findViewById(R.id.scissorsButton);
        lizard = (Button)findViewById(R.id.lizardButton);
        spock = (Button)findViewById(R.id.spockButton);
    }

    public void rockButtonPressed(View button){
        Weapon choice = ROCK;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerChoice", choice.toString());
        startActivity(intent);
    }

    public void paperButtonPressed(View button){
        Weapon choice = PAPER;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerChoice", choice.toString());
        startActivity(intent);
    }

    public void scissorsButtonPressed(View button){
        Weapon choice = SCISSORS;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerChoice", choice.toString());
        startActivity(intent);
    }

    public void lizardButtonPressed(View button){
        Weapon choice = LIZARD;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerChoice", choice.toString());
        startActivity(intent);
    }

    public void spockButtonPressed(View button){
        Weapon choice = SPOCK;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("playerChoice", choice.toString());
        startActivity(intent);
    }
}
