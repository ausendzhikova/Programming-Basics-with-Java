package exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double needMoney = Double.parseDouble(scan.nextLine());
        double ownMoney = Double.parseDouble(scan.nextLine());

        int daysCounter = 0;
        int spendingCounter = 0;

        while (needMoney > ownMoney && spendingCounter < 5) {
            String action = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCounter++;

            if (action.equals("spend")) {
                ownMoney -= money;
                spendingCounter += 1;
                if (ownMoney < 0) {
                    ownMoney = 0;
                }
            } else if (action.equals("save")) {
                ownMoney += money;
                spendingCounter = 0;
            }
        }
        if (spendingCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCounter);
        }
        if (ownMoney >= needMoney) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
