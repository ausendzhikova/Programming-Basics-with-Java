package lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String fruit = scan.nextLine();
        String day = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double totalPrice = 0.00;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {

            switch (fruit) {
                case "banana":
                    totalPrice = quantity * 2.50;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "apple":
                    totalPrice = quantity * 1.20;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "orange":
                    totalPrice = quantity * 0.85;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "grapefruit":
                    totalPrice = 1.45;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "kiwi":
                    totalPrice = quantity * 2.70;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "pineapple":
                    totalPrice = quantity * 5.50;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "grapes":
                    totalPrice = quantity * 3.85;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            switch (fruit) {
                case "banana":
                    totalPrice = quantity * 2.70;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "apple":
                    totalPrice = quantity * 1.25;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "orange":
                    totalPrice = quantity * 0.90;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "grapefruit":
                    totalPrice = quantity * 1.60;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "kiwi":
                    totalPrice = quantity * 3.00;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "pineapple":
                    totalPrice = quantity * 5.60;
                    System.out.printf("%.2f", totalPrice);
                    break;
                case "grapes":
                    totalPrice = quantity * 4.20;
                    System.out.printf("%.2f", totalPrice);
                    break;
                default:
                    System.out.println("error");
                    break;
            }
        } else {
            System.out.println("error");
        }
    }
}