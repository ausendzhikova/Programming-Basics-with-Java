package exercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.00;
        double excellentSholarship = 0.00;

        if (income < minSalary) {
            if (averageGrade > 4.5) {
                socialScholarship = Math.floor(minSalary * 0.35);
            }
        }

        if (averageGrade >= 5.50) {
            excellentSholarship = Math.floor(averageGrade * 25);
        }
        if (socialScholarship > excellentSholarship) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (socialScholarship < excellentSholarship) {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", excellentSholarship);
        }

        if (socialScholarship == 0 && excellentSholarship == 0) {
            System.out.println("You cannot get a scholarship!");
        }

    }
}

