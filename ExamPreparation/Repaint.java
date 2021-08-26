import java.util.Scanner;

public class Repaint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int nylon=Integer.parseInt(scanner.nextLine());
        int paint=Integer.parseInt(scanner.nextLine());
        int dissolve=Integer.parseInt(scanner.nextLine());
        int workHour=Integer.parseInt(scanner.nextLine());

        double nylonPrice=(nylon+2)*1.50;
        double paintPrice=(1.10*paint)*14.50;
        double dissolvePrice=dissolve*5;
        double expenses=nylonPrice+paintPrice+dissolvePrice+0.40;
        double workerPrice=(0.30*expenses)*workHour;
        double totalExpenses=expenses+workerPrice;

        System.out.printf("Total expenses: %.2f lv.",totalExpenses);




    }
}
