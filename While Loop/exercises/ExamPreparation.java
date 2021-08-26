package exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int unsuccessGrades = Integer.parseInt(scan.nextLine());
        int badGrades = 0;
        int problemCount = 0;
        double gradeSum = 0.0;
        String lastProblem = "";

        boolean isGoodGrades = true;
        String exercise = scan.nextLine();


        while (!exercise.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());
            problemCount++;
            gradeSum += grade;
            if (grade <= 4.00) {
                badGrades++;
                if (badGrades == unsuccessGrades) {
                    isGoodGrades = false;
                    break;
                }
            }
            lastProblem = exercise;
            exercise = scan.nextLine();
        }
        if (isGoodGrades) {
            System.out.printf("Average score: %.2f%n", gradeSum / problemCount);
            System.out.printf("Number of problems: %d%n", problemCount);
            System.out.printf("Last problem: %s", lastProblem);

        } else {
            System.out.printf("You need a break, %d poor grades.", badGrades);

        }
    }
}
