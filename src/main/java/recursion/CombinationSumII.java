package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        int target=8;
        int arr[]={10,1,2,7,6,1,5};

        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(arr);
        comboSum(arr,arr.length,target,0, lists, new ArrayList<Integer>());
        System.out.println(lists);
    }

    private static void comboSum(int[] arr, int length, int target, int ind, List<List<Integer>> lists, ArrayList<Integer> ds) {
        if(target==0){
            lists.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<length;i++){
            if(i>ind && arr[i]==arr[i-1])continue;
            if(arr[i]>target)break;

            ds.add(arr[i]);
            comboSum(arr, length, target-arr[i], i+1, lists, ds);
            ds.remove(ds.size()-1);
        }
    }
}
