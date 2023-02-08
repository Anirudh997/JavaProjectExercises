import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;


        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        //Created a Map. Iterating through array. adding each element as key and position as object.
        //if map.containsKey == the target - nums[i].. i.e another value, return current i position and stored integer position
        for(int i=0; i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        String s = Arrays.toString(result);
        System.out.println(s);
    }
}
