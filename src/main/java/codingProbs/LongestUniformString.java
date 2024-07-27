package codingProbs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 *  e.g.
 *      for the input: "abbbccda" the longest uniform substring is "bbb" (which starts at index 1 and is 3 characters long).
 */

public class LongestUniformString {
    private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

    static int[] longestUniformSubstring(String input){
        int longestStart = -1;
        int longestLength = 0;

        int c=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        // your code goes here
        if(input.isEmpty()){
            System.out.println(longestStart + " " + longestLength);
            return new int[]{ longestStart, longestLength };
        }

        map.put(0,1);
        for(int i=1;i<input.length();i++){
            if(input.charAt(i) == input.charAt(i-1)){
                Integer val = map.get(c);
                val++;
                map.put(c,val);
            }else {
                c=i;
                map.put(i,1);
            }
            if(map.get(c)>longestLength){
                longestLength=map.get(c);
                longestStart=c;
            }
        }
        System.out.println(longestLength);
        return new int[]{ longestStart, longestLength };
    }

    public static void main(String[] args) {
        testCases.put("", new int[]{-1, 0});
        testCases.put("10000111", new int[]{1, 4});
        testCases.put("aabbbbbCdAA", new int[]{2, 5});

        boolean pass = true;
        for(Map.Entry<String,int[]> testCase : testCases.entrySet()){
            System.out.println(testCase.getKey());
            int[] result = longestUniformSubstring(testCase.getKey());
            pass = pass && (Arrays.equals(result, testCase.getValue()));
        }
        if(pass){
            System.out.println("Pass!");
        } else {
            System.out.println("Failed! ");
        }
    }
}
