import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int processorsCount=Integer.parseInt(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        int workingDays=Integer.parseInt(scanner.nextLine());

        double workHour= people*workingDays*8;
        double processors=Math.floor(workHour/3);

        double winMoney=(processors-processorsCount)*110.10;
        double lostMoney=(processorsCount-processors)*110.10;

        if(processors>=processorsCount){
            System.out.printf("Profit: -> %.2f BGN",winMoney);
        } else{
            System.out.printf("Losses: -> %.2f BGN",lostMoney);
        }

    }
}
