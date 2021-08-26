package lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double sum = a * 7.61;
        double ots = 0.18 * sum;
        double cena = sum - ots;
        System.out.println("The final price is: " + cena + " lv. ");
        System.out.println("The discount is: " + ots + " lv. " );

    }
}
