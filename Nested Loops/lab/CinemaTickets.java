package lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int ticketCount = 0;

        //Counter
        int totalTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;
        boolean isFinish = false;

        while (!movieName.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String typeTicket = scanner.nextLine();
            while (!typeTicket.equals("End")) {
                ticketCount++;
                totalTickets++;

                switch (typeTicket) {
                    case "student":
                        studentCount++;
                        break;
                    case "standard":
                        standardCount++;
                        break;
                    case "kid":
                        kidCount++;
                        break;
                }
                if (ticketCount == freeSeats) {
                    isFinish = true;
                    break;
                }

                typeTicket = scanner.nextLine();
            }
            double percentFull = 1.0 * ticketCount / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentFull);

            movieName = scanner.nextLine();
            ticketCount = 0;
        }

        if (movieName.equals("Finish") || isFinish) {
            double studentPercent = 1.0 * studentCount / totalTickets * 100;
            double kidPercent = 1.0 * kidCount / totalTickets * 100;
            double standartPercent = 1.0 * standardCount / totalTickets * 100;
            System.out.printf("Total tickets: %d%n", totalTickets);
            System.out.printf("%.2f%% student tickets.%n", studentPercent);
            System.out.printf("%.2f%% standard tickets.%n", standartPercent);
            System.out.printf("%.2f%% kids tickets.", kidPercent);
        }
    }
}

