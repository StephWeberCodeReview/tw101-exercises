package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 * Created by Quits on 7/17/17.
 */

public class Guess {

    int guess;
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> guesses = new ArrayList<Integer>();

    public int getGuess() {
        do {
            System.out.println("Guess a number between 1 and 100: ");
                try {
                    guess = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Exception thrown: " + e);
                }
            guesses.add(guess);
        } while(guess > 100 || guess < 1);
        return guess;
    }

    public boolean checkGuess(int guess, int answer) {
        if (guess == answer) {
            System.out.printf("You got it! The correct number was %d! \n", answer);
            System.out.println("Here are all your guesses: \n");
            for(int i=0; i<guesses.size(); i++) {
                System.out.println(guesses.get(i));
            }
            guesses.clear();
            return false;

        } else if (guess < answer) {
            System.out.println("Good effort! Go big or go home though.");
            return true;
        } else {
            System.out.println("Nice try! Try something smaller.");
            return true;

        }
    }

}
