import java.util.Scanner;

public class SumOfAllDigits {
    public static void sumOfAll(int n){
        int sum = 0;
        int i = 0;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        sumOfAll(num);
        sc.close();
    }
}
