package exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = Integer.parseInt(scanner.nextLine());
        int N2 = Integer.parseInt(scanner.nextLine());
        String operations = scanner.nextLine();

        int result = 0;
        String evenOrOdd = "";

        switch (operations) {
            case "+":
                result = N1 + N2;
                operations = "+";
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operations, N2, result, evenOrOdd);
                break;
            case "-":
                result = N1 - N2;
                operations = "-";
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operations, N2, result, evenOrOdd);
                break;
            case "*":
                result = N1 * N2;
                operations = "*";
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %d - %s", N1, operations, N2, result, evenOrOdd);
                break;


            case "/":
                if (N2 == 0) {
                    System.out.printf("Cannot divide %d by zero", N1);
                } else {
                    double devideResult = 1.0 * N1 / N2;
                    System.out.printf("%d / %d = %.2f", N1, N2, devideResult);
                }
                break;

            case "%":
                if (N2 != 0) {
                    result = N1 % N2;
                    System.out.printf("%d %% %d = %d", N1, N2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", N1);
                }


        }


    }
}
