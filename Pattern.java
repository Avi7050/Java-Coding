class Pattern{
    public static void printStar1(){
        int rows = 0;
        while(rows < 5){
            System.out.print("*");
            int i = 0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }
    public static void main(String[] args) {
        printStar1();
    }
}