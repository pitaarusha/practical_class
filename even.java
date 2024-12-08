// import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        System.out.println("enter the limit:");
        // int limit = sc.nextInt();
        int limit = 100;

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }
        }
        // sc.close();
    }
}
