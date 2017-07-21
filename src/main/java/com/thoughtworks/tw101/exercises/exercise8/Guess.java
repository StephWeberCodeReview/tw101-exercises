package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 * Created by Quits on 7/17/17.
 */

public class Guess {
    Integer guess;
    private Scanner input = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList<>();

    private Integer validateInput(String aGuess){
        try {
            return Integer.parseInt(aGuess);

        } catch (NumberFormatException e) {
            System.out.println("Exception thrown: " + e);
        }
        return null;
    }

    public int getGuess() {
        do {
            System.out.println("Guess a number between 1 and 100: ");
            guess = validateInput(input.nextLine());
        } while(guess == null);

        guesses.add(guess);
        return guess;
    }

    public boolean checkGuess(int answer) {
        if (guess == answer) {
            System.out.format("You got it! The correct number was %d! \n", answer);
            return false;
        } else if (guess < answer) {
            System.out.println("Good effort! Go big or go home though.");
            return true;
        } else {
            System.out.println("Nice try! Try something smaller.");
            return true;
        }
    }

    public void showAllGuesses() {
        System.out.println("Here are all your guesses: \n");
        for (Integer guess : guesses) {
            System.out.println(guess);
        }
        guesses.clear();
    }

}
