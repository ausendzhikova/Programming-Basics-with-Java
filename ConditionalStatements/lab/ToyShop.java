package lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double income = puzzles * 2.6 + doll * 3 + bears * 4.1 + minions * 8.2 + trucks * 2;
        double toy = puzzles + doll + bears + minions + trucks;


        if (toy>=50) {
            income = income - income*0.25;
        }
        double rentforShop = income*0.1;
        double sum = income-rentforShop;
        if (sum >= holidayPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(sum-holidayPrice));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(sum-holidayPrice));
        }
        System.out.println();
        }
    }

