import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//To get most number of duplicate characters in string
public class EYCodingQuestion {
    public static void main(String[] args) {
        String str = "abcdabghfua";
        char[] arr = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : arr){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else {
                Integer val = map.get(c);
                //System.out.println(val);
                map.put(c, ++val);
            }
        }

        Map.Entry<Character,Integer> result = null;
        /*for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() >max){
                result = e;
                max=e.getValue();
            }
        }*/

        int max = map.entrySet().stream().map(e -> e.getValue()).reduce(0, (e1, e2) -> (e1 > e2) ? e1 : e2);
        int min = map.values().stream().reduce(0, (e1, e2) -> (e1 > e2) ? e2 : e1);
        System.out.println("No of repitions is " + max);
        System.out.println("Min No of repitions is " + min);
        //System.out.println("Most repeated char is " + result.getKey());


    }
}
