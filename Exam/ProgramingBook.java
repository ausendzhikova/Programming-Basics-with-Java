import java.util.Scanner;

public class ProgramingBook {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double priceForPage=Double.parseDouble(scanner.nextLine());
        double priceForCover=Double.parseDouble(scanner.nextLine());
        int percentDecrease=Integer.parseInt(scanner.nextLine());
        double sumForDesigner=Double.parseDouble(scanner.nextLine());
        int percentFromTeam=Integer.parseInt(scanner.nextLine());

        double price=priceForPage*899 + priceForCover*2;
        double priceAfterDecrease=price - price*percentDecrease/100;
        double expenses=priceAfterDecrease+sumForDesigner;
        double totalExpenses=expenses -expenses*percentFromTeam/100;

        System.out.printf("Avtonom should pay %.2f BGN.",totalExpenses);

    }
}
