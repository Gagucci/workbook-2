package org.example;
import java.util.Scanner;

public class winCalculator {

    // initializing scanner and needed variables
    static Scanner read = new Scanner(System.in);
    static String teamOne, teamTwo;
    static int scoreOne, scoreTwo;

    // static method called to main to run program
    public static void run() {
        promptUser();
        parseInput();
        printResults();
        determineWinner();
    }
    // prompt user for input in needed format
    public static void promptUser() {
        System.out.println("Welcome to the Win Calculator!");
        System.out.println("Enter format: Team1 : Team2 | Score1 : Score2");
        System.out.print("> ");
    }

    // parses input by splitting first at | and then again at each :
    public static void parseInput() {
        String input = read.nextLine();
        String[] teamsAndScores = input.split("\\|");

        String[] teams = teamsAndScores[0].split(":");
        String[] scores = teamsAndScores[1].split(":");

        // trims any extra whitespace and then parses number from string
        teamOne = teams[0].trim();
        teamTwo = teams[1].trim();
        scoreOne = Integer.parseInt(scores[0].trim());
        scoreTwo = Integer.parseInt(scores[1].trim());
    }

    // prints results
    public static void printResults() {
        System.out.println("\nTeam One: " + teamOne + " | Score: " + scoreOne);
        System.out.println("Team Two: " + teamTwo + " | Score: " + scoreTwo);
    }

    // logic for comparing scores, higher value is returned.
    public static void determineWinner() {
        switch (Integer.compare(scoreOne, scoreTwo)) {
            case 1 -> System.out.println("🏆 " + teamOne + " WINS!");
            case -1 -> System.out.println("🏆 " + teamTwo + " WINS!");
            default -> System.out.println("🤝 IT'S A TIE!");
        }
    }
}