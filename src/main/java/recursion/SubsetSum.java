package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {

        int arr[] = {2,3,4};
        int N = 3;

        ArrayList<Integer> output = new ArrayList<Integer>();
        sbsum(arr, N,output,0,0);
        Collections.sort(output);
        System.out.println(output);
    }

    private static void sbsum(int[] arr, int N, ArrayList<Integer> list, int sum, int ind){

        if(ind == N){
            list.add(sum);
            return;
        }
        sum=sum+arr[ind];
        sbsum(arr,N,list,sum,ind+1);
        sum=sum-arr[ind];
        sbsum(arr,N,list,sum,ind+1);
    }
}
