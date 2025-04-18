package org.example;
import org.example.builderLogic;

public class Main {

    public static void main(String[] args) {

        builderLogic logic = new builderLogic();
        // Call the method to get the full name
        logic.getFullName();
        logic.promptBusiness();

    }

}