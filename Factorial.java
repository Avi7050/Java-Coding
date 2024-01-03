import java.util.Scanner;

public class Factorial {
    /**
    * This is factorial using while loop
    */
    public static void factorial(int n){
        int i = 1;
        int res = 1;
        while(i <= n){
            res *= i;
            i++;
        }
        System.out.println("Factorial using while loop: " + res);
    }
    /**
     * this is using recursion
     * @param n
     * @return
     */
    public static int fact(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return n * fact(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        factorial(num);
        int result = fact(num);
        System.out.println("factorial using recurssion: " + result);
        sc.close();
    }
}
