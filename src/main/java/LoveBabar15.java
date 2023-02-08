public class LoveBabar15 {
    public static void main(String[] args) {
        int[] nums ={2,3,4,5,6};
        int end=0, farthest=0;
        int jump=0;

        for(int i=0;i<nums.length-1;i++){
            farthest = Math.max(farthest, i+ nums[i]);

            if(i==end){
                jump++;
                end = farthest;
            }
        }
        System.out.println(jump);
    }
}
