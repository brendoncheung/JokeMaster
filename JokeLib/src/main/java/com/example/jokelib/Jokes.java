package com.example.jokelib;

import java.io.Serializable;

public class Jokes implements Serializable {

    private String jokeQuestion;
    private String jokeAnswer;

    public Jokes() {
        jokeAnswer = "default";
        jokeQuestion = "default";
    }

    public void setJokeQuestion(String question) {
        jokeQuestion = question;
    }

    public String getJokeQuestion() {
        return jokeQuestion;
    }

    public void setJokeAnswer(String jokeAnswer) {
        this.jokeAnswer = jokeAnswer;
    }

    public String getJokeAnswer() {
        return jokeAnswer;
    }

    public Jokes (String question, String answer){
        this.jokeQuestion = question;
        this.jokeAnswer = answer;
    }

    @Override
    public String toString() {
        return jokeQuestion + "" + jokeAnswer;
    }
}
