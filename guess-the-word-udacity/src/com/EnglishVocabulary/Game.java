package com.EnglishVocabulary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static ArrayList<String> getWordsFromFile(String pathname) {
        ArrayList<String> moviesList = new ArrayList<>();
        try {
            // create file object
            File file = new File(pathname);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                moviesList.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("File not found. Check the path.\n" + exception);
            System.exit(1);
        }
        return moviesList;
    }

    public static String pickWordRandomly(ArrayList<String> list) {
        return list.get(new Random().nextInt(list.size()));
    }

    public static char[] createUnderCoreEmptyArray(String name) {
        char[] arr = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            char letters = name.charAt(i);
            if (letters >= 'a' && letters <= 'z') {
                arr[i] = '_';
            } else {
                arr[i] = letters;
            }
        }
        return arr;
    }

    public static void printOutput(char[] name) {
        for (char n : name) {
            System.out.print(n);
        }
    }

    public static boolean fillLetter(String name, char letter, char[] out, ArrayList<Character> used) {
        boolean flag = false;
        used.add(letter);
        for (int i = 0; i < name.length(); i++) {
            char l = name.charAt(i);
            if (letter == l) {
                out[i] = letter;
                flag = true;
            }
        }
        return flag;
    }

    public static boolean checkIfAllLetterFilled(char[] out) {
        for (char c : out) {
            if (c == '_') return true;
        }
        return false;
    }
}
