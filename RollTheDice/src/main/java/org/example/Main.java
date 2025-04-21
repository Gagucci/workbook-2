package org.example;
import org.example.Dice;

public class Main {
    static int rollOne;
    static int rollTwo;
    static int twoStrikeCounter;
    static int fourStrikeCounter;
    static int sixStrikeCounter;
    static int sevenStrikeCounter;

    public static void main(String[] args) {
        Dice dice = new Dice();
        int rollCount = 3;

        do {
            rollOne = dice.roll();
            rollTwo = dice.roll();
            System.out.println("Roll One: " + rollOne + " + Roll Two: " + rollTwo);
            System.out.println("Sum: " + (rollOne + rollTwo));

            if ((rollOne + rollTwo) == 2) {
                twoStrikeCounter++;
                System.out.println("Two Strike Counter: " + twoStrikeCounter);
            } else if ((rollOne + rollTwo) == 4) {
                fourStrikeCounter++;
                System.out.println("Four Strike Counter:" + fourStrikeCounter);
            } else if ((rollOne + rollTwo) == 6) {
                sixStrikeCounter++;
                System.out.println("Six Strike Counter: " + sixStrikeCounter);
            } else if ((rollOne + rollTwo) == 7) {
                sevenStrikeCounter++;
                System.out.println("Seven Strike Counter: " + sevenStrikeCounter);
            } else {
                System.out.println("No Strike");
            }
            rollCount--;
        } while (rollCount > 0);
    }
}