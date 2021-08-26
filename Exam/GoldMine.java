import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocation = Integer.parseInt(scanner.nextLine());
        double sumGold = 0;
        double averageSum = 0;

        for (int i = 1; i <= numLocation; i++) {
            double goldForDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= days; j++) {
                double collectGold = Double.parseDouble(scanner.nextLine());
                sumGold += collectGold;
            }
            averageSum = sumGold / days;
            sumGold = 0;

            if (averageSum >= goldForDay) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageSum);
            } else {
                System.out.printf("You need %.2f gold.%n", goldForDay - averageSum);
            }


        }
    }
}
