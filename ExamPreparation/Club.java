import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double wishMoney=Double.parseDouble(scanner.nextLine());
       int coctailsPrice=0;
        String coctails=scanner.nextLine();
        double sumMoney=0;
        double totalSum=0;
        boolean isParty=false;

        while(!coctails.equals("Party!")){
            int coctailsCount=Integer.parseInt(scanner.nextLine());
            coctailsPrice = coctails.length();
            sumMoney=coctailsPrice*coctailsCount;
            if(sumMoney%2!=0){
               sumMoney*=0.75;
            }
            totalSum+=sumMoney;


            if(totalSum>=wishMoney) {
                break;
            }
            coctails=scanner.nextLine();

        }
        if (coctails.equals("Party!")){
            System.out.printf("We need %.2f leva more.%n", wishMoney-totalSum);
        } else {
            System.out.println("Target acquired.");
        }
        System.out.printf("Club income - %.2f leva.",totalSum);
    }
}
