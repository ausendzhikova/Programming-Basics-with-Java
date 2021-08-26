import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String city=scanner.nextLine();
        String typePackage=scanner.nextLine();
        String VIP=scanner.nextLine();
        int days=Integer.parseInt(scanner.nextLine());
        double priceForDay=0;
        boolean isValid=true;

        switch(city){
            case "Bansko":
            case "Borovets":
                if (typePackage.equals("withEquipment")){
                    priceForDay=100;

                    if(VIP.equals("yes")){
                        priceForDay*=0.90;
                    }

                } else if(typePackage.equals("noEquipment")){
                    priceForDay=80;
                    if(VIP.equals("yes")){
                        priceForDay*=0.95;
                    }

                } else {
                    isValid=false;
                }
                break;

            case "Varna":
            case "Burgas":
                if (typePackage.equals("withBreakfast")){
                    priceForDay=130;

                    if(VIP.equals("yes")){
                        priceForDay*=0.88;
                    }
                } else if(typePackage.equals("noBreakfast")){
                    priceForDay=100;

                    if(VIP.equals("yes")) {
                        priceForDay *= 0.93;
                    }
                    } else {
                    isValid=false;
                }
                break;

            default:
                isValid=false;
                break;
        }
        double totalPrice=priceForDay*days;
        if(days>7){
            totalPrice=priceForDay*(days-1);
        }

        if(days<1){
            System.out.println("Days must be positive number!");
        }
         else if (isValid){
            System.out.printf("The price is %.2flv! Have a nice time!",totalPrice);
        } else if(!isValid) {
            System.out.println("Invalid input!");
        }
    }
}
