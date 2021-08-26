package lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int start=Integer.parseInt(scanner.nextLine());
        int finish=Integer.parseInt(scanner.nextLine());
        int magicNumber=Integer.parseInt(scanner.nextLine());
        int counter=0;
        int sum=0;
        int x=0;
        int y=0;
boolean flag=false;
        for ( x=start; x<=finish;x++){
            for( y=start; y<=finish; y++){
                counter++;
                 sum=x+y;
                if(sum==magicNumber){
                    flag=true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }
        if(sum==magicNumber){
            System.out.printf("Combination N:%d (%d + %d = %d)",counter,x,y,sum);
        } else {
            System.out.printf("%d combinations - neither equals %d",counter,magicNumber);
        }
        System.out.println();
    }
}
