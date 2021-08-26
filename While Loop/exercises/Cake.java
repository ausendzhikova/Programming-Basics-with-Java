package exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());

        int cakePieces = width * length;
        String pieces = scan.nextLine();
        int piecesCount = 0;
        int overageCake = 0;
        boolean isFinished = false;

        while (!pieces.equals("STOP")) {
            piecesCount += Integer.parseInt(pieces);
            overageCake = cakePieces - piecesCount;
            if (overageCake < 0) {
                isFinished = true;
                break;
            }
            pieces = scan.nextLine();
        }
        if (isFinished) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(overageCake));
        } else {
            System.out.printf("%d pieces are left.", overageCake);
        }
    }
}
