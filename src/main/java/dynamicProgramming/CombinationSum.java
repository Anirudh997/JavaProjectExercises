package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int target=7;
        int arr[]={2,3,5,7};


        //Output expected is [[2,2,3],[7]]

        ArrayList<List<Integer>> lists = new ArrayList<>();
        comboSum(arr,arr.length-1,target, lists, new ArrayList<>());
        System.out.println(lists);
    }

    private static void comboSum(int[] arr, int ind, int target, ArrayList<List<Integer>> lists, ArrayList<Integer> ds) {
        //Step 1
        if(ind<0){
            if(target==0)lists.add(new ArrayList<>(ds));
            return;
        }

        //take
        if(target>=arr[ind]) {
            ds.add(arr[ind]);
            comboSum(arr, ind, target - arr[ind], lists, ds);
            ds.remove(ds.size()-1);
        }

        //not take
        comboSum(arr, ind-1, target, lists, ds);

    }
}
