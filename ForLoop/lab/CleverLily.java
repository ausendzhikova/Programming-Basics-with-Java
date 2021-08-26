package lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWM = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int toys = 0;
        int money = 10;
        int sum = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                sum += money;
                sum -= 1;
                money += 10;
            } else {
                toys++;
            }
        }
        sum = sum + toys * toyPrice;
        if (sum >= priceWM) {
            System.out.printf("Yes! %.2f", sum - priceWM);
        } else {
            System.out.printf("No! %.2f", priceWM - sum);
        }
        System.out.println();
    }
}
