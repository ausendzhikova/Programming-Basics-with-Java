import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveInteger = Integer.parseInt(scanner.nextLine());
        int sumNumber = 0;
        int minSum = Integer.MAX_VALUE;
        int m = 1;
        int p = 1;
        int q = 1;

        
for(int i=1;i<1000;i++){
    for(int j=1;j<1000;j++){
        for(int k=1;k<1000;k++){
            if((i*j*k)==positiveInteger) {
                sumNumber=i+j+k;
                if(sumNumber<minSum){
                    minSum=sumNumber;
                    m=i;
                    p=j;
                    q=k;
                }
            }
        }
    }
}

        System.out.println(m);
        System.out.println(p);
        System.out.println(q);
        System.out.println();

        }


    }

