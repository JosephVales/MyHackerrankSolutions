import java.util.*;
import java.util.regex.Pattern;

class PatternSyntaxChecker {
    public static void main(String[] args){
        //The next lines correspond to the input management
        Scanner sc = new Scanner(System.in);
        int numberOfEntrance = Integer.parseInt(sc.nextLine());
        //Now we complete the task of the problem!
        for (int i=0; i<numberOfEntrance; i++){
            String input = sc.nextLine();
            try {
                Pattern.compile(input);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            } 
        }
        sc.close();

    }
}
