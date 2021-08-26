import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int easterBread=Integer.parseInt(scanner.nextLine());
        int pointCounter=0;
        int maxPoint=0;
        String bakerMax= " ";

        for(int i=1;i<=easterBread;i++){
            String baker=scanner.nextLine();
            String grade=scanner.nextLine();

            while(!grade.equals("Stop")){
               int numGrade=Integer.parseInt(grade);
               pointCounter+=numGrade;

               grade=scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n",baker,pointCounter);

            if(pointCounter>maxPoint){
                maxPoint=pointCounter;
                bakerMax=baker;
                System.out.printf("%s is the new number 1!%n",baker);

            }
            pointCounter=0;

        }
        System.out.printf("%s won competition with %d points!",bakerMax,maxPoint);
    }
}
