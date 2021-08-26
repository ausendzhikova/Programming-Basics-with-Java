package exercises;

import java.util.Scanner;

public class TimeAfter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = minutes + 15;
        int hours = 0;
        int overage = 0;

        if (totalMinutes >= 60) {
            int totalHours = totalMinutes / 60;
            hours = hour + totalHours;
            overage = totalMinutes % 60;
        } else {
            hours = hour;
            overage = totalMinutes;
        }
        if (hours == 24) {
            hours = hours - 24;
        }

        if (overage < 10) {
            System.out.printf("%d:0%d", hours, overage);
        } else {
            System.out.printf("%d:%d", hours, overage);
        }
    }
}
