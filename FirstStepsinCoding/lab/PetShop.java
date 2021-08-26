package lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int other = Integer.parseInt(scanner.nextLine());
        double suma = dog * 2.50 + other * 4;
        System.out.println(suma + " lv ");
    }
}
