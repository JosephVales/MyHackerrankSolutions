import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

class JavaBigDecimal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<String> unOrderedNumbers = new ArrayList<String>();  
        for (int i = 0; i < n; i++){
            unOrderedNumbers.add(sc.nextLine());
        }
        unOrderedNumbers.sort(Comparator.naturalOrder());
        sc.close();
        System.out.println(unOrderedNumbers);
    }
}
