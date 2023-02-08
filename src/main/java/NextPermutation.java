import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr ={1,3,5,4,2};
        int length = arr.length;
        int ind1=0, ind2=0;
        int low =0, high=length-1;
        while(low < high){
            if(arr[low] < arr[low+1]) break;

            low++;
        }

        int temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2]=temp;

        int[] copy = Arrays.copyOfRange(arr, ind2 + 1, length - 1);

        int x=0;
        for(int i = length -1; i>ind2; i--){
            arr[i]=copy[x];
            x++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
