package org.example;
import org.example.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
        static int averageScore;
        static int highestScore;
        static int lowestScore;
    public static void main(String[] args) {


        List<Test> testList = new ArrayList<>();

        Test test1 = new Test(100);
        Test test2 = new Test(90);
        Test test3 = new Test(85);
        Test test4 = new Test(95);
        Test test5 = new Test(84);
        Test test6 = new Test(78);
        Test test7 = new Test(73);
        Test test8 = new Test(50);
        Test test9 = new Test(42);
        Test test10 = new Test(33);

        testList.add(test1);
        testList.add(test2);
        testList.add(test3);
        testList.add(test4);
        testList.add(test5);
        testList.add(test6);
        testList.add(test7);
        testList.add(test8);
        testList.add(test9);
        testList.add(test10);

        int sum = 0;
        for (Test test : testList) {
            sum += test.getTestScore();
        }
        averageScore = sum / testList.size();

        System.out.println("Average Score: " + averageScore);

        // Convert to array first
        Test[] testArray = testList.toArray(new Test[0]);

        Arrays.sort(testArray, (t1, t2) -> t2.getTestScore() - t1.getTestScore());

        highestScore = testArray[0].getTestScore();
        lowestScore = testArray[testArray.length-1].getTestScore();
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);

    }
}