import java.util.Arrays;

//Dutch National Flag Algo
public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,1,0,0,1,1,0,2,1,0};

        int low = 0,temp =0;
        int mid = 0;
        int high = arr.length-1;

        while(mid<high){
            if(arr[mid]==0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==2){
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else{
                mid++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
