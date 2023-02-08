package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSumII {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);
        uniqueSets(nums,nums.length,output, new ArrayList<Integer>(),0);

        System.out.println(output);;
    }

    private static void uniqueSets(int[] nums, int len, List<List<Integer>> output, ArrayList<Integer> ds, int ind) {
        output.add(new ArrayList(ds));
        for(int i=ind;i<len;i++){
            if(i!=ind && nums[i]==nums[i-1])continue;
            ds.add(nums[i]);
            uniqueSets(nums, len, output, ds, i+1);
            ds.remove(ds.size()-1);
        }
    }
}
