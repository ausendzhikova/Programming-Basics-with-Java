import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int countSouvenirs = Integer.parseInt(scanner.nextLine());
        double priceForSouvenirs = 0;
        boolean isValid = true;


        switch (team) {
            case "Argentina":
                switch (souvenirs) {
                    case "flags":
                        priceForSouvenirs = 3.25;
                        break;
                    case "caps":
                        priceForSouvenirs = 7.20;
                        break;
                    case "posters":
                        priceForSouvenirs = 5.10;
                        break;
                    case "stickers":
                        priceForSouvenirs = 1.25;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Brazil":
                switch (souvenirs) {
                    case "flags":
                        priceForSouvenirs = 4.20;
                        break;
                    case "caps":
                        priceForSouvenirs = 8.50;
                        break;
                    case "posters":
                        priceForSouvenirs = 5.35;
                        break;
                    case "stickers":
                        priceForSouvenirs = 1.20;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Croatia":
                switch (souvenirs) {
                    case "flags":
                        priceForSouvenirs = 2.75;
                        break;
                    case "caps":
                        priceForSouvenirs = 6.90;
                        break;
                    case "posters":
                        priceForSouvenirs = 4.95;
                        break;
                    case "stickers":
                        priceForSouvenirs = 1.10;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;
            case "Denmark":
                switch (souvenirs) {
                    case "flags":
                        priceForSouvenirs = 3.10;
                        break;
                    case "caps":
                        priceForSouvenirs = 6.50;
                        break;
                    case "posters":
                        priceForSouvenirs = 4.80;
                        break;
                    case "stickers":
                        priceForSouvenirs = 0.90;
                        break;
                    default:
                        isValid = false;
                        System.out.println("Invalid stock!");
                        break;
                }
                break;

            default:
                isValid = false;
                System.out.println("Invalid country!");
                break;
        }
        if (isValid) {
            double totalPrice = countSouvenirs * priceForSouvenirs;
            System.out.printf("Pepi bought %s %s of %s for %.2f lv.", countSouvenirs, souvenirs, team, totalPrice);
        }
    }
}