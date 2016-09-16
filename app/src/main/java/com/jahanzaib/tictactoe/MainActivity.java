package com.jahanzaib.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9,restart;
    int turn;
    TextView score_0;
    TextView score_x;
    int x = 0;
    int o = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score_0 = (TextView) findViewById(R.id.score_o);
        score_x = (TextView) findViewById(R.id.score_x);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        restart = (Button) findViewById(R.id.button);
        turn = 1;

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")){
                    if (turn == 1) {
                        turn = 2;
                        b1.setText("X");
                    } else if (turn == 2) {
                        turn = 1;
                        b1.setText("O");
                    }
            }
                endGame();
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b2.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b2.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b2.setText("O");
                    }
            endGame();
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b3.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b3.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b3.setText("O");
                    }
                endGame();
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b4.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b4.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b4.setText("O");
                    }
                endGame();
            }

        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b5.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b5.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b5.setText("O");
                    }
                endGame();
            }

        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b6.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b6.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b6.setText("O");
                    }
                endGame();
            }

        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b7.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b7.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b7.setText("O");
                    }
                endGame();
            }

        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b8.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b8.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b8.setText("O");
                    }
                endGame();
            }

        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b9.getText().toString().equals(""))
                    if(turn == 1){
                        turn = 2;
                        b9.setText("X");
                    }
                    else if(turn == 2){
                        turn = 1;
                        b9.setText("O");
                    }
                endGame();
            }

        });
    }

    public void endGame(){
        String  a, b, c, d, e, f, g, h, i;
        boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();

        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();

        g = b7.getText().toString();
        h = b8.getText().toString();
        i = b9.getText().toString();


        //for X player
        if (a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")){
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (c.equals("X") && e.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Player X Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(x++);
            score_x.setText(score);
            resetAllButton();
            end = true;
        }

        //for O player

        if (a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_0.setText(score);
            resetAllButton();
            end = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_x.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);
            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

                score = String.valueOf(o++);

            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }
        }
        if (c.equals("O") && e.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "Player O Wins", Toast.LENGTH_LONG).show();
            String score = "";

            score = String.valueOf(o++);

            score_0.setText(score);
            resetAllButton();
            end = true;
            try{
                Thread.sleep(1000);
            }catch (Exception el){

            }

        }

        if (end == false && b1.getText() != "" && b2.getText() != "" && b3.getText() != "" && b4.getText() != ""
                && b5.getText() != "" && b6.getText() != "" && b7.getText() != "" && b8.getText() != ""
                && b9.getText() != "") {
            try{
                Toast.makeText(MainActivity.this, "Game Draw", Toast.LENGTH_LONG).show();
                Thread.sleep(1000);
            }catch (Exception el){

            }
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");
            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
        }
    }
    public void resetAllButton(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
}
