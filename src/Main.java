import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem();
        printPoint(axisSystem);
        printPoint2(axisSystem);
        printPoints(axisSystem);
        printPointFromTheUser(axisSystem);
        printNumbersOfPoints(axisSystem);

    }

    public static void printPoint(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(100, 150, "GREEN");
    }
    public static void printPoint2(AxisSystem axisSystem) {
        axisSystem.addSinglePoint(-200, 200, "GREEN");
}
    public static void printPoints (AxisSystem axisSystem){
        axisSystem.addMultiplePoints(new int[]{50, 50, 60, 60, 70, 70},"GREEN");

    }
    public static void printPointFromTheUser (AxisSystem axisSystem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x-");
        int x = scanner.nextInt();
        System.out.println("enter the y-");
        int y = scanner.nextInt();
        axisSystem.addSinglePoint(x,y,"RED");
    }
    public static void printNumbersOfPoints (AxisSystem axisSystem){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many points do you want?");
        int points = scanner.nextInt();
        System.out.println("what color would you like?");
        String color = scanner.nextLine();
        Random random = new Random();
        int point = random.nextInt();
        int [] pointsArr ={points};
        axisSystem.addMultiplePoints(pointsArr,color);
    }
    public static void printLine (int x, int y,AxisSystem axisSystem){
        for (int i = 0; i < 250; i++) {
            if (y != 2 * x + 100) {
                axisSystem.addSinglePoint(x,y,"RED");
            }


        }
    }

}
