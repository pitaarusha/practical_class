import java.util.Scanner;
public class natural {
    // 1 write the program to print natural numbers from 1 to n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number: ");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}