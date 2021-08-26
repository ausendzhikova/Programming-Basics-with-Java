import java.util.Scanner;

public class FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;
        //Back", "Chest", "Legs", "Abs",
        //"Protein shake" или "Protein bar")

        for (int i = 1; i <= visitors; i++) {
            String action = scanner.nextLine();
            switch (action) {
                case "Back":
                    backCount++;
                    break;
                case "Chest":
                    chestCount++;
                    break;
                case "Legs":
                    legsCount++;
                    break;
                case "Abs":
                    absCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    break;
            }
        }
        double trainers = 1.0 * (backCount + chestCount + legsCount + absCount) / visitors * 100;
        double otherVisitors = 1.0 * (proteinBarCount + proteinShakeCount) / visitors * 100;

        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);
        System.out.printf("%.2f%% - work out%n", trainers);
        System.out.printf("%.2f%% - protein", otherVisitors);
    }
}
