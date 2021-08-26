package exercises;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double boadRent = 0;

        if (season.equals("Spring")) {
            boadRent = 3000;
        } else if (season.equals("Autumn") || season.equals("Summer")) {
            boadRent = 4200;
        } else if (season.equals("Winter")) {
            boadRent = 2600;
        }

        if (fishermen <= 6) {
            boadRent *= 0.9;
        } else if (fishermen <= 11) {
            boadRent *= 0.85;
        } else {
            boadRent *= 0.75;
        }

        if (fishermen % 2 == 0 && !season.equals(("Autumn"))) {
            boadRent *= 0.95;
        }

        if (budget >= boadRent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - boadRent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - boadRent));
        }
    }
}
