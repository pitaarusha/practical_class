import java.util.Scanner;;
public class reverse {
    // natural number in reverse 
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number;

        number = sc.nextInt();
        for (int i = 0; i < number; number++) {
            System.out.println(number);
        }
        sc.close();
    }
}
