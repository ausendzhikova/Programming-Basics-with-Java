package exercises;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = Integer.parseInt(scanner.nextLine());
        double bonusScore = 0.00;

        if (score <= 100) {
            bonusScore = 5;
        } else if (score <= 1000) {
            bonusScore = score * 0.20;
        } else {
            bonusScore = score * 0.10;
        }
        if (score % 2 == 0) {
            bonusScore = bonusScore + 1;
        } else if (score % 5 == 0) {
            bonusScore = bonusScore + 2;
        }
        System.out.println(bonusScore);
        System.out.println(score + bonusScore);

    }
}
