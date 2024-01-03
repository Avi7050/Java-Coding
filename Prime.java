import java.util.Scanner;

public class Prime {
    public static void primeNo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count != 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
        sc.close();
    }

    public static void main(String[] args) {
        primeNo();
    }
}
