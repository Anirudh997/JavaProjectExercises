import java.util.Arrays;

public class CyclicRotateRight {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        int[] result = new int[arr.length];
        int[] leftResult = new int[arr.length];

        int k=1;
        for(int i=0;i<arr.length;i++){
            int m = (k+i)%arr.length;
            result[m] = arr[i];
        }
        //Right rotated
        System.out.println(Arrays.toString(result));

        //Left rotated
        int n = k%arr.length;
        for(int i=0; i<arr.length;i++){
            if(i-n >= 0){
                leftResult[i-n] = arr[i];
            }else{
                leftResult[arr.length + (i-n)] = arr[i];
            }
        }
        System.out.println(Arrays.toString(leftResult));
    }
}
