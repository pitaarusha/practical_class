// package .dist;

public class nested {
    public static void main(String[] args) {
        int a = 5;
        int b = 71;
        int c = 71;

        // and operators here 
        if (a > b && a > c) {
            System.out.println(a + " is greater than " + b + " and " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " is greater than " + a + " and " + c);
        } else if (c > a && c > b) {
            System.out.println(c + " is greater than " + a + " and " + a);
        } else {
            System.out.println(c + " is greater than " + b + " and " + a);
        }
    }
}