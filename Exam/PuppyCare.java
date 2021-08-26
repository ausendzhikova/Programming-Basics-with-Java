import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int foodKg=Integer.parseInt(scanner.nextLine());
        String food=scanner.nextLine();
        int sumEatenFood=0;

        while(!food.equals("Adopted")){
            int gramFood=Integer.parseInt(food);
            sumEatenFood+=gramFood;

            food=scanner.nextLine();
        }

        if(sumEatenFood>foodKg*1000){
            System.out.printf("Food is not enough. You need %d grams more.", sumEatenFood-foodKg*1000);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.",foodKg*1000-sumEatenFood);
        }




    }
}
