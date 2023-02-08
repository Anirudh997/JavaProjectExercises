import java.util.Arrays;
import java.util.Comparator;

public class KthMinMaxElement {
    public static void main(String[] args) {
        int[] nums ={7, 10, 4, 3, 20, 15,30};
        int k = 3;
        //inputs

        //method 1
        Arrays.sort(nums);
        System.out.println("kth min is: " + nums[k-1]);
        System.out.println("Kth max is: " + nums[(nums.length -1) - k]);

        int end = Integer.MAX_VALUE;
    }
}
