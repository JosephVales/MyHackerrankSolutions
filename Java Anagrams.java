import java.util.*;

class JavaAnagrams {
    public static boolean isAnagram(String a, String b){
        //If length is not equal it can't be a Anagram
        if (a.length()!=b.length()){
            return false;
        }else{
        //We deal with the CaseInSensitive lowerig or uppering all the letters
            a = a.toLowerCase();
            b = b.toLowerCase();

        //We will use a HashMap to store the letters and its frecuency 
        HashMap <Character, Integer> aHashMap = new HashMap<Character, Integer>();
        for (int i=0; i<a.length(); i++){
            char letter = a.charAt(i);
            if (aHashMap.get(letter)==null){
                aHashMap.put(letter, 1);
            }else{
                Integer frecuency = aHashMap.get(letter);
                aHashMap.put(letter, ++frecuency);
            }
        }
        for (int i=0; i<b.length(); i++){
            char letter = b.charAt(i);
            if (aHashMap.get(letter)==null || aHashMap.get(letter)==0){
                return false;
            }else{
                Integer frecuency = aHashMap.get(letter);
                aHashMap.put(letter, --frecuency);
            }
        }
        return true;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        System.out.println(isAnagram(a, b));
    }    
}
