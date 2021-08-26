package exercises;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String projection = scan.nextLine();
        int rolls = Integer.parseInt(scan.nextLine());
        int column = Integer.parseInt(scan.nextLine());

        int places = rolls * column;
        double profit = 0.0;

        if (projection.equals("Premiere")) {
            profit = places * 12;

        } else if (projection.equals("Normal")) {
            profit = places * 7.50;

        } else if (projection.equals("Discount")) {
            profit = places * 5;
        }
        System.out.printf("%.2f leva", profit);
    }
}
