package exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget*0.10;

        if (people > 150) {
            clothesPrice = clothesPrice*0.9;
        }
        double expense = people * clothesPrice + decor;
        if ( expense > budget) {
            System.out.printf("Not enough money! %n" +
                    "Wingard needs %.2f leva more.", Math.abs(expense - budget));
        } else {
            System.out.printf("Action! %n" +
                    "Wingard starts filming with %.2f leva left.", Math.abs(expense-budget));
        }
    }
}
