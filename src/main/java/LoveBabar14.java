import java.util.Arrays;

public class LoveBabar14 {
    public static void main(String[] args) {
        int[] arr = {7,3,2,4,5};
        int k = 3,low=0;

        Arrays.sort(arr);

        while(low<arr.length){
            if(arr[low] >= k){
                int val = (arr[(arr.length -1)] - k) - (arr[low] + k);
                System.out.println(val);
                break;
            }
            low++;
        }
    }
}
