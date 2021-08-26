package lab;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double comissons = 0.0;

        if (city.equals("Sofia")) {
            if (s < 0) {
                System.out.println("error");
            } else if (s >= 0 && s <= 500) {
                comissons = s * 0.05;
                System.out.printf("%.2f", comissons);
            } else if (s > 500 && s <= 1000) {
                comissons = s * 0.07;
                System.out.printf("%.2f", comissons);
            } else if (s > 1000 && s <= 10000) {
                comissons = s * 0.08;
                System.out.printf("%.2f", comissons);
            } else if (s > 10000) {
                comissons = s * 0.12;
                System.out.printf("%.2f", comissons);
            }


        } else if (city.equals("Varna")) {
            if (s < 0) {
                System.out.println("error");
            } else if (s >= 0 && s <= 500) {
                comissons = s * 0.045;
                System.out.printf("%.2f", comissons);
            } else if (s > 500 && s <= 1000) {
                comissons = s * 0.075;
                System.out.printf("%.2f", comissons);
            } else if (s > 1000 && s <= 10000) {
                comissons = s * 0.10;
                System.out.printf("%.2f", comissons);
            } else if (s > 10000) {
                comissons = s * 0.13;
                System.out.printf("%.2f", comissons);
            }

        } else if (city.equals("Plovdiv")) {
            if (s < 0) {
                System.out.println("error");
            } else if (s >= 0 && s <= 500) {
                comissons = s * 0.055;
                System.out.printf("%.2f", comissons);
            } else if (s > 500 && s <= 1000) {
                comissons = s * 0.08;
                System.out.printf("%.2f", comissons);
            } else if (s > 1000 && s <= 10000) {
                comissons = s * 0.12;
                System.out.printf("%.2f", comissons);
            } else if (s > 10000) {
                comissons = s * 0.145;
                System.out.printf("%.2f", comissons);
            }

        } else {
            System.out.println("error");
        }
    }
}