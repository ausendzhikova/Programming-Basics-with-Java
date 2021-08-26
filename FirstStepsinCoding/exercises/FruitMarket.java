package exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberries = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());

        double raspberriesPrice = strawberriesPrice * 0.5;
        double orangesPrice = raspberriesPrice * 0.6;
        double bananasPrice = raspberriesPrice * 0.2;

        double result = strawberriesPrice * strawberries + raspberriesPrice * raspberries +
                orangesPrice * oranges + bananasPrice * bananas;

        System.out.printf("%.2f", result);
    }
}

