package lab;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int project = Integer.parseInt(scanner.nextLine());
        int hours = 3 * project;
        System.out.printf( "The architect %s will need %d hours to complete %d project/s." , name, hours, project);
    }
}
