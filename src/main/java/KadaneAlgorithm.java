import java.util.Arrays;
//Q: To find maximum subarray with maximum sum
public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr ={-2,-3,4,-1,-2,1,5,-3};
        int high = arr.length;
        int low=0;
        int max =0;
        int sum =0;
        int lcount=0, mcount =0;
        while(low < high){
            if(arr[low] + sum > 0) {
                sum = sum + arr[low];
                if(lcount==0){
                    lcount = low;
                }
            }else{
                sum=0;
                lcount=0;
            }
            if(sum>max){
                max = sum;
                mcount = low;
            }
            low++;
        }
        //Max sum
        System.out.println(max);

        //Max Subarray
        System.out.println(Arrays.toString(Arrays.copyOfRange(arr, lcount, mcount+1)));
    }
}
