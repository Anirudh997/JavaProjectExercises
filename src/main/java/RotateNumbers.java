import java.util.Arrays;

public class RotateNumbers {
    public static void main(String[] args) {
        int k =3;
        int[] nums ={1,2,3,4,5,6,7};
        //input given

        k= k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] num, int start, int end) {
        while(start < end){
            int temp = num[start];
            num[start++] = num[end];
            num[end--] = temp;
        }
    }
}
