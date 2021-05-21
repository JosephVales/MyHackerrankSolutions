import java.util.*;

class RecursionFibonacciNumbers {
    public static int fibonacci(int num){
        if (num<3){
            return(1);
        } else {
            return(fibonacci(num-1) + fibonacci(num-2));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(num));
    }
}
