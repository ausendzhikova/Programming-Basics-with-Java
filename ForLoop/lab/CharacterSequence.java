package lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int length = text.length();

        for (int i = 0; i <= length - 1; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
