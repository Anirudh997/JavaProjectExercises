import java.util.List;
import java.util.stream.Collectors;

public class AccoliteInterview {
    public static void main(String[] args) {
        String str1="adhisytra";
        String str2="data";
        String str3 ="adhisytr";

        if(hasDuplicate(str1,str2)){
            System.out.println("true");
        }
        if(!hasDuplicate(str3,str2)){
            System.out.println("false");
        }
    }

    private static boolean hasDuplicate(String str1, String str2) {

        List<Character> letters1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> letters2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        //return letters1.removeAll(letters2);
        while(letters2.size()>0){
            Character ch = letters2.get(0);
            if(letters1.contains(ch)){
                letters1.remove(ch);
                letters2.remove(ch);
            }
            else{
                return false;
            }
        }

        return true;
    }
}
