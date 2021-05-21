import java.util.*;

class MarkAndToys {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long numberOfToys = sc.nextLong();
        long moneyToSpend = sc.nextLong();
        int toysPurchased = 0;
        Long[] toysPrices = new Long[(int) (numberOfToys)];
        for(int i=0; i<numberOfToys; i++){
            toysPrices[i]=sc.nextLong();
        }
        sc.close();
        Arrays.sort(toysPrices);
        for(long item : toysPrices){
            if (moneyToSpend>=item){
                moneyToSpend-=item;
                toysPurchased++;
            }
            else{
                break;
            }
        }
        System.out.print(toysPurchased);
    }  
}
