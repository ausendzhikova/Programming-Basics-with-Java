package lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int day=Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String assessment =scanner.nextLine();

        double totalPrice=0.0;
        int nights=day-1;

        if (typeOfRoom.equals("room for one person")){
            totalPrice=nights*18;
        }
        else if (typeOfRoom.equals("apartment")) {
            if(day<10){
                totalPrice=nights*25*0.7;
            } else if(day<=15){
                totalPrice=nights*25*0.65;
            } else {
                totalPrice=nights*25*0.5;
            }
        }
        else if(typeOfRoom.equals("president apartment")){
            if(day<10){
                totalPrice=nights*35*0.9;
            } else if(day<=15){
                totalPrice=nights*35*0.85;
            } else {
                totalPrice=nights*35*0.8;

            }
        }
        if ( assessment.equals("positive")){
            totalPrice=totalPrice*1.25;
        } else if (assessment.equals("negative")){
            totalPrice=totalPrice*0.90;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
