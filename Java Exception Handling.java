import java.util.Scanner;

class MyCalculator {
    long power(int i,int j) throws Exception{
        if (i<0 || j<0){
            throw new Exception("n or p should not be negative.");
        }else if(i==0 && j==0){
            throw new Exception("n and p should not be zero.");
        }else{
            return (long) (Math.pow(i, j));
        }
    } 
}

class ExceptionHandlingJava {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}