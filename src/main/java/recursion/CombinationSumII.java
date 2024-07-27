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

        if(ind>arr.length-1) {
            if (target == 0) {
                lists.add(new ArrayList<>(ds));
            }
            return;
        }
        if(target>=arr[ind]){
            ds.add(arr[ind]);
            comboSum(arr,length,target-arr[ind],ind+1,lists,ds);
            ds.remove(ds.size()-1);
        }
        comboSum(arr,length,target,ind+1,lists,ds);
    }
}
