import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TagContentExtractor {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
        Scanner in = new Scanner(System.in);
        int linesToRead = Integer.parseInt(in.nextLine());
        for (int i=0;i<linesToRead;i++){
            String line = in.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()==false){
                System.out.println("None");
            }else{
                matcher.reset();
                while(matcher.find()){
                    System.out.println(matcher.group(2));
                }    
            }
            
        }
        in.close();
    }
}
