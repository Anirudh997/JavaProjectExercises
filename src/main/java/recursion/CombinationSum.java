package recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int target=7;
        int arr[]={2,3,5,7};

        //Output expected is [[2,2,3],[7]]

        ArrayList<List<Integer>> lists = new ArrayList<>();
        comboSum(arr,arr.length,target,0, lists, new ArrayList<>());
        System.out.println(lists);
    }


    private static void comboSum(int[] arr, int len, int target, int ind, ArrayList<List<Integer>> lists,List<Integer> ds) {
        if(ind==len){
            if(target==0){
                lists.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[ind]<=target){
            ds.add(arr[ind]);
            //If to get individual elements to form target - O/P [[2, 5], [7]]
            //comboSum(arr, len, target-arr[ind], ind+1, lists, ds);
            //If to get duplicat of individual elements to form target
            comboSum(arr, len, target-arr[ind], ind, lists, ds);
            ds.remove(ds.size()-1);
        }
        comboSum(arr, len, target, ind+1, lists, ds);
    }
}
