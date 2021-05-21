import java.util.*;

class NewYearChaos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> queue = new ArrayList<Integer>();
        final int numberOfLoops = sc.nextInt();
        for (int z=0; z<numberOfLoops;z++){
            int numberOfParticipants = sc.nextInt();
            for (int i=0; i<numberOfParticipants; i++){
                queue.add(sc.nextInt());
            }
            int auxiliarVariable;
            Integer counter = 0;
            String result="";
            for (int j =0; j<2; j++){
                for (int i=numberOfParticipants-1; i>0; i--){
                    if (queue.get(i)<queue.get(i-1)){
                        auxiliarVariable = queue.get(i);
                        queue.set(i, queue.get(i-1));
                        queue.set(i-1, auxiliarVariable);
                        counter++;
                    }
               }
            }
            for (int i=numberOfParticipants-1; i>0; i--){
                if (queue.get(i)<queue.get(i-1)){
                    result="Too chaotic";
                    break;
                }
                else{
                    result=Integer.toString(counter);
                }
           }
           queue.clear();
           System.out.println(result);
        }
        sc.close();
    }
}