import java.util.*;

class StringsMakingAnagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] string_1 = sc.next().split("");
        String[] string_2 = sc.next().split("");
        Map<String,Integer> string_1_elements = new HashMap<>();
        Map<String,Integer> string_2_elements = new HashMap<>();
        String[] abc = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        int totalRemoves = 0;
        sc.close();
        for (String item : string_1){
            if (string_1_elements.containsKey(item)){
                string_1_elements.put(item, string_1_elements.get(item)+1);
            }
            else{
                string_1_elements.put(item, 1);
            }
        }
        for (String item : string_2){
            if (string_2_elements.containsKey(item)){
                string_2_elements.put(item, string_2_elements.get(item)+1);
            }
            else{
                string_2_elements.put(item, 1);
            }
        }
        for (String item : abc){
            if (string_1_elements.containsKey(item) && string_2_elements.containsKey(item)){
                totalRemoves += Math.abs(string_1_elements.get(item) - string_2_elements.get(item));                
            }
            else if (string_1_elements.containsKey(item)){
                totalRemoves += string_1_elements.get(item);
            }
            else if (string_2_elements.containsKey(item)){
                totalRemoves += string_2_elements.get(item);
            }
        }
        System.out.println(totalRemoves);
    }
    
}
