package com.poppleton.dogs;

import java.util.ArrayList;
import java.util.Arrays;

public class Dog {

    private String name;
    private String breed;
    private String owner;

    private ArrayList <DogShowScore> showScores;


    public Dog (String name, String breed, String owner) {
        this.name = name;
        this.breed = breed;
        this.owner = owner;

        this.showScores = new ArrayList<> ();
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getBreed () {
        return breed;
    }

    public void setBreed (String breed) {
        this.breed = breed;
    }

    public String getOwner () {
        return owner;
    }

    public void setOwner (String owner) {
        this.owner = owner;
    }

    public void addScore (DogShowScore newScore) {
        this.showScores.add (newScore);
    }

    public int getNumberOfEventsEntered () {
        return this.showScores.size ();
    }

    public double getShowScore () {

        final int scoreCount = this.showScores.size ();
        double score = 0;
        int[] scores = new int [scoreCount];

        if (scoreCount >= 3) {
            for (int i = 0; i < scoreCount; i++) {
                scores[i] = this.showScores.get (i).getScore ();
            }

            Arrays.sort (scores);

            score = (scores[scoreCount - 1] + scores[scoreCount - 2] + scores[scoreCount - 3]) / 3.0;
        }

        return score;

    }

    public int getBestScore () {

        int bestScore = 0;

        for (DogShowScore score: this.showScores) {
            if (score.getScore () > bestScore) {
                bestScore = score.getScore ();
            }
        }

        return bestScore;
    }

    public String getBestEvent () {

        int bestScore = this.getBestScore ();

        if (bestScore == 0) {
            return "";
        }
        else {
            for (DogShowScore score: this.showScores) {
                if (score.getScore () == bestScore) {
                    return score.getEvent ();
                }
            }
        }

        return "";

    }

    public String getOwnerDetailsAsString () {

        return this.getName () + " the dog is owned by " + this.getOwner () + ".";

    }

}
