package lab;

import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        double sumMoney = 0;


        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            while (sumMoney < budget) {
                double money = Double.parseDouble(scanner.nextLine());
                sumMoney += money;
            }

            System.out.printf("Going to %s!%n", destination);

            destination = scanner.nextLine();
            sumMoney = 0;
        }

    }
}


