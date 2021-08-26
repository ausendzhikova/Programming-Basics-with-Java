package exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();
        int presentationsCount = 0;
        double average = 0.0;

        while (!presentationName.equals("Finish")) {
            double gradeSum = 0.0;
            double averageGrade = 0.0;
            for (int i = 0; i < n; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                gradeSum += grades;
            }
            averageGrade = gradeSum / n;
            System.out.printf("%s - %.2f.", presentationName, averageGrade);
            System.out.println();
            presentationsCount++;
            average += averageGrade;
            presentationName = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", average / presentationsCount);
    }
}
