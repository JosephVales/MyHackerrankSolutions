import java.util.*;

class Swaps2{

    public static int swappingThing(int[] array){
        final int aLength = array.length;
        int temp,counter=0;
        for (int i=0; i<aLength; i++){
            if (array[i]!=i+1){
                temp = array[i];
                array[i] = array[temp-1];
                array[temp-1] = temp;
                i--;
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrayLenght = sc.nextInt();
        int[] array = new int[arrayLenght];
        for (int i=0; i<arrayLenght; i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(swappingThing(array));
    }
}