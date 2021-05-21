import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionHandling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            int input1 = sc.nextInt();
            int input2 = sc.nextInt();
            System.out.println(input1/input2);
        } catch (ArithmeticException e){
            System.out.println(e.getClass().getName() + ": / by zero");
        } catch (InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        sc.close();
    }
}
