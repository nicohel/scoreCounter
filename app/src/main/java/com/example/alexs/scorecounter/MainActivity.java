package com.example.alexs.scorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

    /**
     * This activity keeps track of the basketball score for 2 teams.
     */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int teamAscore = 0;

    // Tracks the score for Team B
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Team A score controls
     */
    public void addThreePointsA(View v) {
        teamAscore = teamAscore + 3;
        displayScoreA(teamAscore);
    }
    public void addTwoPointsA(View v) {
        teamAscore = teamAscore + 2;
        displayScoreA(teamAscore);
    }
    public void addOnePointA(View v) {
        teamAscore = teamAscore + 1;
        displayScoreA(teamAscore);
    }

    /**
     * Team B score controls
     */
    public void addThreePointsB(View v) {
        teamBscore = teamBscore + 3;
        displayScoreB(teamBscore);
    }
    public void addTwoPointsB(View v) {
        teamBscore = teamBscore + 2;
        displayScoreB(teamBscore);
    }
    public void addOnePointB(View v) {
        teamBscore = teamBscore + 1;
        displayScoreB(teamBscore);
    }

    /**
     * Reset button. AKA 'THE BUTTON'.
     */
    public void resetAll(View v) {
        teamAscore = 0;
        teamBscore = 0;
        displayScoreA(teamAscore);
        displayScoreB(teamBscore);
    }

    /**
     * Display method to change out score texts. Should be replaced by using string variables later on instead?
     */
    public void displayScoreA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.teamA_score);
        scoreview.setText(String.valueOf(score));
    }
    public void displayScoreB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.teamB_score);
        scoreview.setText(String.valueOf(score));
    }

}

