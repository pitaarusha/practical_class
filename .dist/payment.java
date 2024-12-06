// package .dist;

import java.util.Scanner;

public class payment {
    public static void main(String[] args) {
        // allow the input to the user in a variables
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the payment: ");
        double pay = sc.nextDouble();

        System.out.println("Enter the score: ");
        double score = sc.nextDouble();

        if (score > 90) {
            double amount = pay + (pay * 0.03);
            System.out.println("Your payment is " + amount);
        }

        else if (score <= 90) {
            double amount = pay + (pay * 0.01);
            System.out.println("Your payment is " + amount + " each month");

            sc.close();
        }
    }
}
