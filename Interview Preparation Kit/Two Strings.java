import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class TwoStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] string_1;
        String[] string_2;
        Set<String> my_set_string_1 = new HashSet<String>();
        Set<String> my_set_string_2 = new HashSet<String>();
        String answer = "NO";
        while(n-- > 0){
            string_1 = sc.nextLine().split("");
            string_2 = sc.nextLine().split("");
            for (String item : string_1){
                my_set_string_1.add(item);
            }
            for (String item : string_2){
                my_set_string_2.add(item);
            }
            for (String item : my_set_string_1){
                if (my_set_string_2.contains(item)){
                    answer="YES";
                    System.out.println(item);
                    break;
                }
            }
            System.out.println(answer);
            my_set_string_1.clear();
            my_set_string_2.clear();
            answer="NO";
        }
        sc.close();
    }
}
