import java.util.Scanner;
class JavaSubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String my_String = sc.nextLine();
        Integer start = sc.nextInt();
        Integer end = sc.nextInt();
        sc.close();
        System.out.print(my_String.substring(start, end));
    }
}
