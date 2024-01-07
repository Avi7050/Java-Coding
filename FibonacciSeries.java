import java.util.Scanner;

public class FibonacciSeries {
    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    public static void fibo(int end){
        int start = userInput();
        int second = start + 1;
        int temp = 0;
        
        for(int i = start; i <= end;i++){
            System.out.print(start + " ");
            start = second;
            second = temp;
            temp = start + second;
        }
    }
    
    public static void main(String[] args) {
        fibo(30);
    }
}
