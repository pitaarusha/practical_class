import java.util.Scanner;;

public class reverse {
    // natural number in reverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int reversed = 0;

        System.out.println("enter the number: ");
        // takes the number to be reversed
        number = sc.nextInt();
        
        //condition for the reversing of the number
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
        sc.close();
    }
}
