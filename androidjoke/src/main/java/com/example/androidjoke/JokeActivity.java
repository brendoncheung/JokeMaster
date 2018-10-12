package com.example.androidjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.jokelib.Jokes;

public class JokeActivity extends AppCompatActivity {

    private TextView tv_jokeQuestion, tv_jokeAnswer;
    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        initialization();

        Intent intent = getIntent();

        if (intent.hasExtra(JOKE_EXTRA)) {
            Jokes joke = (Jokes) intent.getExtras().getSerializable(JOKE_EXTRA);
            setJokes(joke);
        }
    }


    private void initialization() {
        tv_jokeAnswer = findViewById(R.id.tv_joke_answer);
        tv_jokeQuestion = findViewById(R.id.tv_joke_question);
    }

    private void setJokes(Jokes joke) {
        tv_jokeAnswer.setText(joke.getJokeAnswer());
        tv_jokeQuestion.setText(joke.getJokeQuestion());
    }
}
