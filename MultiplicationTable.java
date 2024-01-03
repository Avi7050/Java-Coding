import java.util.Scanner;

public class MultiplicationTable {
    public static void table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table number: ");
        int num = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        sc.close();
    }

    public static void main(String[] args) {
        table();
    }
}
