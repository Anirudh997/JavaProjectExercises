package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        //input is array. output is reverse of it
        //Achived by recursion
        int arr[]={1,2,3,5,6,8};

        reverseArr(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(System.out::println);
    }

    private static void reverseArr(int[] arr, int i, int j) {
        if(i>j){
            return;
        }
        swapArr(arr,i,j);
        reverseArr(arr,i+1,j-1);
    }

    private static void swapArr(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j]=temp;
    }
}
