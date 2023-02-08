import java.util.Arrays;
import java.util.PriorityQueue;

public class MoveNegative {
    public static void main(String[] args) {
        int[] nums = {-12,-13,11,-5,6,-7,5,-3,-6};
        int[] arr = new int[nums.length];
        int count =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i] < 0){
                arr[count]=nums[i];
                count++;
            }
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                arr[count]=nums[i];
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
