package exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();
        String output = scan.nextLine();

        if (input.equals("cm")) {
            num = num * 1;
        } else if (input.equals("mm")) {
            num = num / 10;
        } else if (input.equals("m")) {
            num = num * 100;
        }

        if (output.equals("cm")) {
            num = num * 1;
        } else if (output.equals("mm")) {
            num = num * 10;
        } else if (output.equals("m")) {
            num = num / 100;
        }

        System.out.printf("%.3f", num);
    }

}

