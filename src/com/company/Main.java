package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println(evenOrFalse(12));
        System.out.println(compareTwoWords("hello", "heooo"));
        letterOnNewLine("what's new");
        randomNumberPrinter();
        System.out.println(randomNumberPrinter());
        newWord("hello");
        sameNumberChecker(2, 3);
        nextDay(31, 12, 1991);
        notFour(9);
        countryDomain();
        vowelOrConsonant();
    }

    //1. works
    public static boolean evenOrFalse(int number) {
        if (number % 2 == 0) {
            return true;

        } else {
            return false;
        }

    }

    //2. works
    public static boolean compareTwoWords(String word1, String word2) {

        if (word1.equalsIgnoreCase(word2)) {
            return true;
        } else {
            return false;
        }

    }

    //3. works
    public static void letterOnNewLine(String wordLetters) {

        for (int c = 0; c < wordLetters.length(); c++) {
            if (wordLetters.charAt(c) == 'w') {
                break;
            } else {
                System.out.println(wordLetters.charAt(c));
            }
        }
    }

    //4. works
    public static double randomNumberPrinter() {
        double bigNumber = Math.random() * 100;

        if ((bigNumber) > 50) {
            return (bigNumber);
        } else {
            return -1;
        }


    }

    //5. works
    public static void nextDay(int day, int month, int year) {

        if (month > 12) {
            System.out.println("Please enter a valid month.");
            return;
        } else if (day <= 30) {

            System.out.println("day: " + (day + 1) + " month: " + month + " year: " + year);
        } else if (month == 12) {
            System.out.println("day: 1" + " month: 1 " + "year: " + (year + 1));
        }

    }


    //6. works
    public static void newWord(String aString) {

        for (int c = 0; c < aString.length(); c += 2) {

            System.out.println(aString.charAt(c));
        }


    }

    //7. w
    public static void notFour(int numberGreaterThanFive) {

        if (numberGreaterThanFive <= 5) {
            System.out.println("Please enter a number greater than 5");
        } else {
            int i = 1;
            while (i < numberGreaterThanFive) {

                if (i == 4) {
                    i++;

                }
                System.out.println(i);
                i++;

            }
        }
    }


    //8. works
    public static void sameNumberChecker(int num1, int num2) {
        int numSum2;
        int numSum1;

        if (num1 == num2) {
            numSum2 = (num1 + 2) + (num2 + 2);

            System.out.println(numSum2);
        } else {
            numSum1 = (num1 + 1) + (num2 + 1);
            System.out.println(numSum1);

        }
    }
        //9.
    public static void countryDomain() {
        System.out.println("Please enter country domain.");
        Scanner scanner = new Scanner(System.in);
        String userINput = scanner.nextLine();

        switch (userINput = userINput.toLowerCase()) {
            case "us":
                System.out.println("United States");
                break;
            case "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
                break;

        }
    }

    //10.
    public static void vowelOrConsonant(){
        System.out.println("Please type a letter.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "a":
                System.out.print("This is a vowel!");
                break;
            case "e":
                System.out.print("This is a vowel!");
                break;
            case "i":
                System.out.print("This is a vowel!");
                break;
            case "o":
                System.out.print("This is a vowel!");
                break;
            case "u":
                System.out.print("This is a vowel!");
                break;
            case "y":
                System.out.print("This is a vowel... sometimes!");
                break;
            default:
                System.out.print("This is a consonant!");
                break;

        }

    }

}