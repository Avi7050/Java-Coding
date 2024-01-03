import java.util.Scanner;

public class LCM {
    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        return num;
    }
    
    public static void lcm(){
        int num1 = userInput();
        int num2 = userInput();
        int i = 1;
        int res = 1;
        if(i < num2 || num2 < num1){
           while(i % num1 == 0 && i % num2 == 0){
            res = i;
           }
        }
        System.out.println("LCM: " + res);
    }
    public static void main(String[] args) {
        lcm();
    }
}
