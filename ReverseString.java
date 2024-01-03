import java.util.Scanner;

public class ReverseString {
    public static void reverseString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse String: " + rev);
        sc.close();
    }

    public static void main(String[] args) {
        reverseString();
    }
}
