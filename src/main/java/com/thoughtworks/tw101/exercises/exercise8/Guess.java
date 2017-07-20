package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 * Created by Quits on 7/17/17.
 */

public class Guess {

    private Scanner input = new Scanner(System.in);
    private ArrayList<Integer> guesses = new ArrayList<>();

    public int getGuess() {
        int guess = -1;
        boolean validGuess = false;
        do {
            System.out.println("Guess a number between 1 and 100: ");
                try {
                    guess = Integer.parseInt(input.nextLine());
                    guesses.add(guess);
                    validGuess = true;
                } catch (NumberFormatException e) {
                    System.out.println("Exception thrown: " + e);
                }

        } while(!validGuess);
        return guess;
    }

    public boolean checkGuess(int guess, int answer) {
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
