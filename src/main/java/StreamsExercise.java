import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExercise {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] arr = {2,1,2,3,4,5,6,3,4,5};
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        //print duplicates
        list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet()).forEach(System.out::println);

        //print first duplicate
        Set<Integer> set2 = new HashSet<>();
        Integer first = list.stream().filter(n -> !set2.add(n)).collect(Collectors.toSet()).stream().findFirst().get();
        System.out.println(first);

        //print count the no of duplicate variables
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));
        System.out.println(map);

        Collection<Integer> values =  map.values();
        Integer max = Collections.max(values);

        Set<Integer> integers = map.keySet();

        Collections.sort(list);
        Integer integer = map.get(3);
        System.out.println(integer);

        //Predicate Interface example

        Predicate<Integer> pr = a -> (a>10); // Creating Predicate;
        System.out.println(pr.test(11));


    }
}
