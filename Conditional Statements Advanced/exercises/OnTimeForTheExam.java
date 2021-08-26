package exercises;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());

        int minutesExam = hourOfExam * 60 + minutesOfExam;
        int minutesArrival = hourOfArrival * 60 + minutesOfArrival;
        int difference = minutesExam - minutesArrival;

        if (difference <= 30 && difference>=0) {
            System.out.println("On time");
        } else if (difference > 30) {
            System.out.println("Early");
        } else if (minutesArrival > minutesExam) {
            System.out.println("Late");
        }

        if (minutesArrival != minutesExam) {
            if ( difference>=0 && difference < 60) {
                System.out.printf("%d minutes before the start", difference);
            } else if (difference >= 60) {
                int hour = difference / 60;
                int overage = difference % 60;
                if (overage < 10) {
                    System.out.printf("%d:0%d hours before the start", hour, overage);
                } else {
                    System.out.printf("%d:%d hours before the start", hour, overage);
                }
            } else if (minutesArrival - minutesExam < 60) {
                System.out.printf("%d minutes after the start", minutesArrival - minutesExam);
            } else if (minutesArrival - minutesExam >= 60) {
                int hour = (minutesArrival - minutesExam) / 60;
                int overage = (minutesArrival - minutesExam) % 60;
                if (overage < 10) {
                    System.out.printf("%d:0%d hours after the start", hour, overage);
                } else {
                    System.out.printf("%d:%d hours after the start", hour, overage);
                }
            }
        }

        System.out.println();
    }
}
