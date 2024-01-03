import java.util.Scanner;

public class Reverse {
    public static void reverseNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int digit = sc.nextInt();
        int rev = 0;
        while (digit != 0) {
            int rem = digit % 10;
            rev = rev * 10 + rem;
            digit /= 10;
        }
        System.out.println("Reverse Digit: " + rev);
        sc.close();
    } 

    public static void main(String[] args) {
        reverseNum();
    }
}
