package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5) {
            System.out.println("I love Java " + counter);
            counter++;
        }
    }
}

class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("I love java " + i);
        }
    }
}