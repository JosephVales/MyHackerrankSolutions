import java.util.*;

class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k){
        var smallest = s.substring(0,k);
        var largest = s.substring(0,k);
        for (int i=0; i<(s.length()-k+1); i++){
            if (smallest.compareTo(s.substring(i, k+i))>0){
                smallest = s.substring(i, k+i);
            }
            if (largest.compareTo(s.substring(i, k+i))<0){
                largest = s.substring(i, k+i);
            }
        }
        return (smallest + "\n" + largest);
    }

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int k = sc.nextInt();
    sc.close();

    System.out.print(getSmallestAndLargest(s, k));
}
}