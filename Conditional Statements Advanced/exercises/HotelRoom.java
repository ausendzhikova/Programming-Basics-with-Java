package exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceForApartment = 0.0;
        double priceForStudio = 0.0;

        if ("May".equals(month) || "October".equals(month)) {
            priceForApartment = 65 * nights;
            priceForStudio = 50 * nights;
            if (nights > 7 && nights <= 14) {
                priceForStudio = nights * 50 * 0.95;
            } else if (nights > 14) {
                priceForStudio = nights * 50 * 0.70;
                priceForApartment = nights * 65 * 0.90;
            }
        } else if ("June".equals(month) || "September".equals(month)) {
            priceForApartment = 68.70 * nights;
            priceForStudio = 75.20 * nights;
            if (nights > 14) {
                priceForStudio = nights * 75.20 * 0.80;
                priceForApartment = nights * 68.70 * 0.90;
            }
        } else if ("July".equals(month) || "August".equals(month)) {
            priceForApartment = 77 * nights;
            priceForStudio = 76 * nights;
            if (nights > 14) {
                priceForApartment = nights * 77 * 0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv. %n", priceForApartment);
        System.out.printf("Studio: %.2f lv.", priceForStudio);
    }
}
