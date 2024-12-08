import java.util.Scanner;

public class multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the table number:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(number * i);
        }
        sc.close();
    }
}
