package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamScoreA=0;
    int teamScoreB=0;
    int teamAwickets=0;
    int teamBwickets=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for Team A.
     */
    public void teamAsix(View view)
    {
        teamScoreA+=6;
        displayForTeamA(teamScoreA);
    }
    public void teamAfour(View view)
    {
        teamScoreA+=4;
        displayForTeamA(teamScoreA);
    }
    public void teamAtwo(View view)
    {
        teamScoreA+=2;
        displayForTeamA(teamScoreA);
    }
    public void teamAone(View view)
    {
        teamScoreA+=1;
        displayForTeamA(teamScoreA);
    }
    public void teamAwicket(View view)
    {
        teamAwickets+=1;
        displayWicketTeamA(teamAwickets);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_awic_score);
        scoreView.setText(String.valueOf(score));
    }
    public void teamBsix(View view)
    {
        teamScoreB+=6;
        displayForTeamB(teamScoreB);
    }
    public void teamBfour(View view)
    {
        teamScoreB+=4;
        displayForTeamB(teamScoreB);
    }
    public void teamBtwo(View view)
    {
        teamScoreB+=2;
        displayForTeamB(teamScoreB);
    }
    public void teamBone(View view)
    {
        teamScoreB+=1;
        displayForTeamB(teamScoreB);
    }
    public void teamBwicket(View view)
    {
        teamBwickets+=1;
        displayWicketTeamB(teamBwickets);
    }
    public void reset(View view)
    {
        teamScoreB=0;
        teamScoreA=0;
        teamAwickets=0;
        teamBwickets=0;
        displayWicketTeamA(teamAwickets);
        displayWicketTeamB(teamBwickets);
        displayForTeamA(teamScoreA);
        displayForTeamB(teamScoreB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWicketTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_bwic_score);
        scoreView.setText(String.valueOf(score));
    }
}
