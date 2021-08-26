package exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int confectioner = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int waffles = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double sumfor1dayby1confectioner = cake * 45 + waffles * 5.80 + pancakes * 3.20;
        double Sum = confectioner * days * sumfor1dayby1confectioner;
        double consumption = 1.0/8 * Sum;
        double result = Sum - consumption;

        System.out.printf("%.2f", result);
    }
}
