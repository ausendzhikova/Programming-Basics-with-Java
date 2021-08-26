package exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());


        double gameInWeekend = (48 - h) * 3 / 4.0 + h;
        double gameInHolidays = p * 2 / 3.0;
        double game = gameInHolidays + gameInWeekend;

        if (typeOfYear.equals("leap")) {
            game *= 1.15;
        }
        System.out.println(Math.floor(game));


    }
}

