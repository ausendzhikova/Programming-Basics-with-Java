package exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scan.nextLine());
        double distance = Double.parseDouble(scan.nextLine());
        double secondFormeter = Double.parseDouble(scan.nextLine());

        double lag = Math.floor((distance / 15)) * 12.5;
        double IvanRecord = distance * secondFormeter + lag;

        if (IvanRecord < worldRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", IvanRecord);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(worldRecord - IvanRecord));
        }
        System.out.println();
    }
}


