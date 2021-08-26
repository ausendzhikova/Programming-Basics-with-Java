package lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String sum = scan.nextLine();
        double totalMoney = 0;

        while (!sum.equals("NoMoreMoney")) {
            double money = Double.parseDouble(sum);

            if (money < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            System.out.printf("Increase: %.2f%n", money);
            totalMoney += money;

            sum = scan.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}
