import java.util.*;

class ArrayManipulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] myArray = new long[n+1];
        for (int i=0; i<m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            long k = sc.nextLong();
            myArray[a] += k;
            myArray[b+1] -= k; 
        }
        sc.close();
        long sum = 0;
        long max = 0;
        for (int i=0; i<n; i++){
            sum += myArray[i];
            if (sum>max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}

