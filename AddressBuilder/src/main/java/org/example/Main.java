package org.example;
import org.example.builderLogic;

public class Main {

    public static void main(String[] args) {

       // builderLogic logic = new builderLogic();

        //logic.runProgram();

//        for (int call = 1; call <= 5; call++) {
//            System.out.println("Missed call #" + call + " 📲");
//        }

        //Goal: Use a while loop to show how many unread notifications you still have, counting down to zero
        int unreadNotifications = 5;
        System.out.println("You have " + unreadNotifications + " unread notifications.");
        do {
            System.out.println("Clearing notification #" + unreadNotifications);
            unreadNotifications--;
        } while (unreadNotifications > 0);

        if (unreadNotifications == 0) {
            System.out.println("You're all caught up! No unread notifications.");
        }


    }

}