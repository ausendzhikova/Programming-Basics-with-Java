package lab;

import java.util.Scanner;

public class GraduationPart2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int classCount = 0;
        double badGrades = 0.0;
        double gradeSum = 0.0;

        while (classCount < 12) {
            double annualGrade = Double.parseDouble(scan.nextLine());
            if (annualGrade < 4) {
                badGrades++;
                if (badGrades == 2) {
                    break;
                }
                continue;
            }
            classCount++;
            gradeSum += annualGrade;
        }

        if (classCount == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, gradeSum / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, ++classCount);
        }

    }
}
