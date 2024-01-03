public class Bitwise {
    public static void main(String[] args) {

        System.out.println("Check number is even/odd: ");
        int num = 100;
        if((num & 1) == 1){
            System.out.println("Num is odd");
        }else {
            System.out.println("num is even");
        }
    }
}
