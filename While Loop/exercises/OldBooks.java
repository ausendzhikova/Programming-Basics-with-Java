package exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String favouriteBook = scan.nextLine();
        int bookCount = 0;
        String book = scan.nextLine();
        boolean isFinished = false;

        while (!book.equals("No More Books")) {

            if (book.equals(favouriteBook)) {
                isFinished = true;
                break;
            }
            bookCount++;
            book = scan.nextLine();
        }
        if (isFinished) {
            System.out.printf("You checked %d books and found it.", bookCount);

        } else {
            System.out.printf("The book you search is not here!%n" +
                    "You checked %d books.", bookCount);
        }
    }
}
