import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDuplicateNumberOptimal {
    public static void main(String[] args) {
        int[] num = {1,2,4,5,7,7,3,4,8};
        // Linked List Cycle method
        int slow = num[0];
        int fast = num[0];
        do{
            slow = num[slow];
            fast = num[num[fast]];
        }while (slow!=fast);

        fast = num[0];

        while (slow!=fast){
            slow = num[slow];
            fast = num[fast];
        }
        //System.out.println(slow);
        // Array method when numbers are less in teh array length
        int[] arr = new int[num.length];
        for(int i =0; i<num.length;i++){
            int a = num[i];
            if(arr[a]>=1){
                System.out.println(a);
            }
            arr[a] = arr[a] + 1;
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i]==0){
                System.out.println("Missing number is " + i);
            }
        }
        String s = "  A I love you";
        s = s.trim().replace(" ","");
        //System.out.println(s);

        int[] a = {1,2,3,4,5,6,7,8,10};
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<a.length;i++){
            list.add(a[i]);
        }
        Integer x = 1;
        list.removeIf(i -> i==x);
        System.out.println(list);
    }
}
