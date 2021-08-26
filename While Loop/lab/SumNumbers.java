package lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int num=Integer.parseInt(scan.nextLine());
        int number=Integer.parseInt(scan.nextLine());
        int sum=number;

        while(sum<num){
            number=Integer.parseInt(scan.nextLine());
            sum+=number;
        }
        System.out.println(sum);
    }
}
