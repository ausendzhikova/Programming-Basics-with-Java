package exercises;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pageinBook = Integer.parseInt(scanner.nextLine());
        int pageforhour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int pageforday = pageinBook / days;
        int neededhours = pageforday / pageforhour;

        System.out.println(neededhours);
    }
}
