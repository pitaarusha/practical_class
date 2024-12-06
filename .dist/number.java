// package .dist;
import java.util.Scanner;
public class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the table number: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
