package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Random;

/**
 * Created by Quits on 7/17/17.
 */

public class GameSetup {

    Guess guess = new Guess();

    private int getRandomNumber() {
        Random randInt = new Random();
        int randomNumber = randInt.nextInt(100) + 1;
        return randomNumber;
    }


    public void playGame() {
        boolean stillPlaying;
        int answer = getRandomNumber();
        System.out.println("Would you like to play a game? \n");

        do {
            guess.getGuess();
            stillPlaying = guess.checkGuess(answer);
        } while (stillPlaying);

        guess.showAllGuesses();
    }
}
