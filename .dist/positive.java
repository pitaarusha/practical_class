
// package .dist;
import java.util.Scanner;

public class positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        double number;
        number = sc.nextDouble();
        if (number > 0) {
            System.out.println("its positive number");
        }

        // System.out.println(number);
        sc.close();
    }
}
