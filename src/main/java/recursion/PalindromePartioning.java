package recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartioning {
    public static void main(String[] args) {
        String s ="aabb";

        List<List<String>> output= new ArrayList<>();

        part(s,output,s.length()-1,new ArrayList<>());
        System.out.println(output);
    }

    private static void part(String str, List<List<String>> output, int ind,List<String> ds) {
        if(ind==0){
            output.add(new ArrayList<>(ds));
            return;
        }

        if(isPalin(str.substring(ind))){
            ds.add(str.substring(ind));
        }
        part(str, output, ind-1, ds);
    }

    private static boolean isPalin(String str) {
        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        if(reverse.toString().equals(str)){
            return true;
        }
        return false;
    }
}
