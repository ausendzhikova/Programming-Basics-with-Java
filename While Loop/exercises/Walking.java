package exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String steps = "";
        int stepsSum = 0;

        while (stepsSum < 10000) {
            steps = scan.nextLine();
//            int stepsCount = Integer.parseInt(steps);
            if (steps.equals("Going home")) {
                stepsSum += Integer.parseInt(scan.nextLine());
                break;
            } else {
                stepsSum += Integer.parseInt(steps);
            }
        }
        if (stepsSum >= 10000) {
            System.out.printf("Goal reached! Good job!%n" +
                    "%d steps over the goal!", stepsSum - 10000);
        } else {
            System.out.printf("%d more steps to reach goal.", 10000 - stepsSum);
        }
    }
}
