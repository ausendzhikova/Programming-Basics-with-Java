package exercises;

import java.util.Scanner;

public class PaswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int a = 97 + L;
        for (int symb1 = 1; symb1 <= n; symb1++) {

            for (int symb2 = 1; symb2 <= n; symb2++) {

                for (int symb3 = 97; symb3 < a; symb3++) {
                    char symbol = (char) symb3;

                    for (int symb4 = 97; symb4 < a; symb4++) {
                        char symbol1 = (char) symb4;

                        for (int symb5 = 1; symb5 <= n; symb5++) {
                            if (symb5 > symb1 && symb5 > symb2) {
                                System.out.printf("%d%d%c%c%d ", symb1, symb2, symb3, symb4, symb5);
                            }
                        }
                    }
                }
            }
        }
    }
}
