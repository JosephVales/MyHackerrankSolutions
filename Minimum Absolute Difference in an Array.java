import java.util.*;

class MinimumAbsoluteDifferenceArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int minNegative = -10000, minPositive= 10000, maxNegative = 0, maxPositive = 0;
        for (int i=0; i<arrayLength; i++){
            array[i] = sc.nextInt();
            if (array[i]< 0){
                if (array[i]>minNegative){
                    minPositive = array[i];
                } else if (array[i]<maxNegative){
                    maxNegative = array[i];
                }
            } else if (array[i]>maxPositive){
                maxPositive = array[i];
            } else if (array[i]<minPositive ){
                minPositive = array[i];
            }
        }
        sc.close();
        System.out.println(maxNegative + " " +minNegative+ " " +maxPositive + " "+ minPositive);
    }
    
}
