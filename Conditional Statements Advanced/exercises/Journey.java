package exercises;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String typeVacation = "";
        double expenses = 0.0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                expenses = budget * 0.30;
                typeVacation = "Camp";
            } else if (season.equals("winter")) {
                expenses = budget * 0.70;
                typeVacation = "Hotel";
            }

        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                expenses = budget * 0.40;
                typeVacation = "Camp";
            } else if (season.equals("winter")) {
                expenses = budget * 0.80;
                typeVacation = "Hotel";
            }

        } else {
            destination = "Europe";
            expenses = budget * 0.90;
            typeVacation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", typeVacation, expenses);
    }
}

