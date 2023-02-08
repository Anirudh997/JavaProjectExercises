import java.util.Arrays;
import java.util.OptionalInt;

public class MinMaxArrayNumber {
    public static void main(String[] args) {
        int[] nums  ={2,5,6,4,1,3};
        //inputs

        //method 1
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();


        //method 2
        int min1 =nums[0];
        int max1 =nums[1];
        for(int i=0; i<nums.length;i++){
            if(i==0 || i==1){
                continue;
            }
            if(nums[i] < min1 && nums[i] != min1){
                min1 = nums[i];
                continue;
            }
            if(nums[i] > max1){
                max1 = nums[i];
            }
        }
        System.out.println(max1);
        System.out.println(min1);

    }
}
