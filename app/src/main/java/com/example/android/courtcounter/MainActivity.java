package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.text.NumberFormat;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void threePointer(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointer(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrow(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void threePointerB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointerB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void resetButton(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }
}

