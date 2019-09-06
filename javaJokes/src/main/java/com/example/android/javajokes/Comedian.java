package com.example.android.javajokes;

import java.util.ArrayList;
import java.util.Random;

public class Comedian {

    private ArrayList<String> jokes = new ArrayList<>();

    public Comedian(){
        initializeJokes();
    }

    public String tellJoke(){

        // Get a random number between 0 and jokes.size - 1
        Random r = new Random();
        int low = 0;
        int high = jokes.size() - 1;
        int random = r.nextInt(high - low) + low;

        return jokes.get(random);
    }

    private void initializeJokes(){

        jokes.add("What is the difference between a snowman and a snow-woman?,\n" +
                "Snowballs.");
        jokes.add("What does a vegan zombie eat?\n" +
                "Graaaaaaaaaaaaaaaaaaaains!!");
        jokes.add("What did one snowman say to the other snowman?\n" +
                "It smells like carrots out here!");
        jokes.add("Where do cows go for a first date?\n" +
                "To the moooovies!");
        jokes.add("What does a clock do when it's hungry?\n" +
                "It goes back four seconds!");
    }

}
