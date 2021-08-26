import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int videocards=Integer.parseInt(scanner.nextLine());
        int procesors=Integer.parseInt(scanner.nextLine());
        int RAM=Integer.parseInt(scanner.nextLine());

        double videocardPrice=videocards*250.0;
        double procesorPrice=procesors * 0.35*videocardPrice;
        double RAMPrice=RAM*0.10*videocardPrice;
        double totalPrice=videocardPrice+procesorPrice+RAMPrice;

        if(videocards>procesors){
            totalPrice*=0.85;
        }

        if (budget>=totalPrice){
            System.out.printf("You have %.2f leva left!", budget-totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice-budget);
        }
    }
}
