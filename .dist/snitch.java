
// package .dist;
import java.util.Scanner;

public class snitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number from 1 to 6: ");

        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;

            default:
                System.out.println("error");
                break;
        }
        sc.close();
    }
}