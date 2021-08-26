package exercises;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int RentforHall = Integer.parseInt(scanner.nextLine());

        double cakePrice = RentforHall * 0.20;
        double drinksPrice = cakePrice - cakePrice * 0.45;
        double animator = 1.0/3 * RentforHall;

        double result = cakePrice + drinksPrice + animator + RentforHall;

        System.out.println(result);

    }
}
