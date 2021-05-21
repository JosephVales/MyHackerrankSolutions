import java.util.*;

class JavaStringTokens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String my_String = sc.nextLine().trim();
        sc.close();
        if (my_String.length()==0){
            System.out.println("0");    
        }else{
            String pattern ="[ !,?._'@]+";
            String[] my_Array = my_String.split(pattern);
            if (my_Array.length <= 400000){
                System.out.println(my_Array.length);
                for (String item : my_Array){
                System.out.println(item);
                }
            }   
        }    
    }   
}
