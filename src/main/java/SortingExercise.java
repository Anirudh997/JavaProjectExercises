import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortingExercise {
    public static void main(String[] args) {
        int[] arr ={1,34,45,22,33,56};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        Arrays.stream(arr).sorted().forEach(System.out::println);
        //for (int i=0;i<arr.length;i++){
        //    System.out.println(arr[i]);
        //}
    }
}
