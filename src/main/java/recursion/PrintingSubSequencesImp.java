package recursion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class PrintingSubSequencesImp {
    public static void main(String[] args) {
        //Input arr to which we will print all possible subsequences
        int[] arr = {3,1,2};
        Stack<Integer> result = new Stack<>();

        //printing all subsequences
        //subseq(arr,arr.length,0, result);

        //printing all subsequnces whose sum is 2
        int[] arr2 = {1,2,1};
        int sum =2;
        int val=0;
        Stack<Integer> result2 = new Stack<>();
        //subseqWithSum3(arr2,arr2.length,0,result2,sum, val);

        //Printing only one subseq whose sum is 2
        int[] arr3 = {1,2,1};
        int sum1 =2;
        int val1=0;
        Stack<Integer> result3 = new Stack<>();
        subseqWithSum3WithOneSeq(arr3,arr3.length,0,result3,sum1, val1);
    }

    private static void subseqWithSum3WithOneSeq(int[] arr3, int length, int i, Stack<Integer> result3, int sum1, int val1) {
        if(i>=length){
            return;
        }
        result3.push(arr3[i]);
        val1=val1+arr3[i];
        if(i==length-1 && sum1==val1){
            System.out.println(result3);
            return;
        }
        subseqWithSum3WithOneSeq(arr3, length, i+1, result3, sum1, val1);
        result3.pop();
        val1=val1-arr3[i];
        subseqWithSum3WithOneSeq(arr3,length,i+1,result3,sum1,val1);
    }

    private static void subseqWithSum3(int[] arr, int length, int i, Stack<Integer> result2, int sum, int val) {
        if(i>=length){
            return;
        }
        result2.push(arr[i]);
        val=val+arr[i];
        if(sum==val){
            System.out.println(result2);
        }
        subseqWithSum3(arr, length, i+1, result2, sum, val);
        result2.pop();
        val=val-arr[i];
        subseqWithSum3(arr,length,i+1,result2,sum,val);
    }

    private static void subseq(int[] arr, int len, int i, Stack<Integer> result) {
        if(i>=len){
            System.out.println(result);
            return;
        }
        result.push(arr[i]);
        subseq(arr,len,i+1,result);
        result.pop();
        subseq(arr,len,i+1,result);
    }
}
