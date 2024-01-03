import java.util.Scanner;

public class SumOfOddNum {
    public static void sumOfOdd(int n){
        int i = 1;
        int start = i;
        int sum = 0;
        while(i <= n){
            if(i % 2 != 0){
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of all odd nums between: " + start + " and " + n + " :" + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        sumOfOdd(num);
        sc.close();
    }
}
