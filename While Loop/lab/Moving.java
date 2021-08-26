package lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        int volume = width * length * height;

        String boxes = scan.nextLine();

        while (!boxes.equals("Done")) {
            int boxesCount = Integer.parseInt(boxes);
            volume -= boxesCount;

            if (volume < 0) {
                break;
            }
            boxes = scan.nextLine();

        }
        if (volume >= 0) {
            System.out.printf("%d Cubic meters left.", volume);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
        }


    }
}
