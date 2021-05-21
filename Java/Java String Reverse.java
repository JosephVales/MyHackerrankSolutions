import java.util.*;

class JavaStringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.next();
        sc.close();
        String[] my_palindrome = palindrome.split("");
        palindrome = "Yes";
        for (int i=0; i<(my_palindrome.length/2); i++){
            System.out.println(my_palindrome[i]);
            System.out.println(my_palindrome[my_palindrome.length-i-1]);
            if (!my_palindrome[i].equals(my_palindrome[my_palindrome.length-i-1])){
                palindrome = "No";
                break;
            }
        }
        System.out.print(palindrome);
    }
}
