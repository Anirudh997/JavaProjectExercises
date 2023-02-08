import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,6,7};
        int[] arr2 = {2,3,5,6};
        List<Integer> list = new ArrayList<>();
        int low1 =0;
        int high1 = arr1.length-1;
        int low2 =0;
        int high2=arr2.length-1;

        //Union code
        while(true){
            if(low1 > high1 && low2 >high2){
                break;
            }
            if(low2 >high2 || arr1[low1] < arr2[low2]){
                list.add(arr1[low1]);
                low1++;
            }else if(low1 > high1 || arr2[low2] < arr1[low1]){
                list.add(arr2[low2]);
                low2++;
            }else{
                list.add(arr1[low1]);
                low1++;
                low2++;
            }
        }
        //Intersection code
        System.out.println(list);
        list.clear();
        low1=0;
        low2=0;
        while(true){
            if(low1 > high1 && low2 >high2){
                break;
            }
            if(low2 >high2 || arr1[low1] < arr2[low2]){
                low1++;
            }else if(low1 > high1 || arr2[low2] < arr1[low1]){
                low2++;
            }else{
                list.add(arr1[low1]);
                low1++;
                low2++;
            }
        }
        //Intersection
        System.out.println(list);

    }
}
