import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SDESheet1 {
    public static void main(String[] args) {
        long A[] = {1,2,5,4,0};
        long B[] = {2,4,5,0,1};

        Arrays.parallelSort(A);
        Arrays.parallelSort(B);
        Arrays.stream(A).limit(2);

        ArrayList<Integer> list = new ArrayList<>();
        //Important - converting array to List
        //list.addAll(Arrays.asList(ArrayUtils.toObject(A)));

        //Converting list to array
        //int[] result = ArrayUtils.toPrimitive(list.toArray(new Integer[list.size()]));

        char c[]={'c','b','w'};
        StringBuilder s = new StringBuilder();
        s.append(" " +c[1]);
        System.out.println(s.substring(1));
        boolean contains = s.toString().contains(" ");
        if(contains){
            System.out.println("present");
        }

        long count = Stream.concat(Stream.of(A), Stream.of(B)).distinct().count();
        System.out.println(count);
    }
}
