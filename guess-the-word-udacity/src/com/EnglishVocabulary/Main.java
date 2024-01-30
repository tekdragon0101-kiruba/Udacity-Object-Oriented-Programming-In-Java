package com.EnglishVocabulary;

import java.util.ArrayList;
import java.util.Scanner;

import static com.EnglishVocabulary.Game.printOutput;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> usedLetters = new ArrayList<>();
        // Give 10 chance to user to find the word
        int chances = 10;
        String wordToGuess = Game.pickWordRandomly(Game.getWordsFromFile("words.txt"));

        // E.G. movie name is TITAN means _____. output like this.
        char[] userGuesses = Game.createUnderCoreEmptyArray(wordToGuess);

        while (chances > 0 && Game.checkIfAllLetterFilled(userGuesses)) {
            printOutput(userGuesses);
            System.out.println();
            System.out.println("Used letters are: " + usedLetters);
            System.out.print("You have " + chances + " chances and Guess the word: ");
            // Ask the user input

            char letter = scanner.next().charAt(0);
            if (letter >= 'a' && letter <= 'z') {
                if (usedLetters.contains(letter)) {
                    System.out.println("You Already used that letter. Please try again.");
                } else if (!Game.fillLetter(wordToGuess, letter, userGuesses, usedLetters)) {
                    chances--;
                }
            } else {
                System.out.println("Invalid input. Please give letter only.");
            }
        }
        if (!Game.checkIfAllLetterFilled(userGuesses)) {
            System.out.println("Congrats! You guessed the word " + wordToGuess.toUpperCase() + " correctly.");
        } else {
            System.out.println("You Lose! The correct word: " + wordToGuess.toUpperCase());
        }
    }
}