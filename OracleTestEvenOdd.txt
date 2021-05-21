import java.util.Scanner;
public class OracleTestEvenOdd {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int indexToSearch = sc.nextInt();
        int n=0, acc=0, passedNumbers=0;
        sc.close();
        /* The next lines will check for the current range of our Index (1-9),(10-99),(100-999),etc.*/
        while(true){
            acc += 9*Math.pow(10, n)*(n + 1);
            if(indexToSearch > acc){
                passedNumbers += 9*Math.pow(10, n); // passedNumbers will help us to remember the already counted numbers
                /* Ex1: if my Index is 15, passedNumbers will store that we already counted from 1-9 
                   Ex2: if my Index is 192, passedNumbers will store that we already counted from 1-99 */
                n++; 
            } else {
                break;
            }
        }
        acc -= 9*Math.pow(10, n)*(n + 1); //The last value of the loop is overflowed so we have to return 1 value 
        indexToSearch -= acc;  
        int residue = indexToSearch % (n + 1);
        int numbersJumped = indexToSearch / (n + 1); 
        if (residue == 0){ //Means we are in the last digit of a number
            passedNumbers += numbersJumped;
            String[] digits = Integer.toString(passedNumbers).split("");
            if (Integer.parseInt(digits[digits.length - 1])%2==0){ //We have to split the number into its digits and take the last digit
                System.out.print("EVEN");
            } else {
                System.out.print("ODD");
            }
        } else { //Means we are in some digit of the number except for the last one 
            passedNumbers += (numbersJumped + 1);
            String[] digits = Integer.toString(passedNumbers).split("");
            if (Integer.parseInt(digits[residue - 1])%2==0){ //We have to split the number into its digits and take the desired digit
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }
        }
    }
}
