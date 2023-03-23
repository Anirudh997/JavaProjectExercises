package dynamicProgramming;

import java.util.ArrayList;

public class FindingTriplets {
    public static void main(String[] args) {
        int target=7;
        int arr[]={2,3,5,7};

        System.out.println(findTriplets(arr,4,7));

    }

    public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

        // Write your code here.
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        tri(arr.length-1,K, arr,lists,new ArrayList<>());

        return lists;
    }

    private static void tri(int ind, int target,int[] arr, ArrayList<ArrayList<Integer>> lists, ArrayList<Integer> ds){
        //Base case
        if(ind<0){
            if(target ==0)lists.add(new ArrayList<>(ds));
            return;
        }

        //take
        if(target>=arr[ind]){
            ds.add(arr[ind]);
            tri(ind-1, target-arr[ind], arr, lists, ds);
            ds.remove(ds.size()-1);
        }

        //not take
        tri(ind-1,target,arr, lists,ds);
    }
}
