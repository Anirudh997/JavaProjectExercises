import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCounterAndFinder {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Map<Integer, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        long duplicateCount = frequencyMap.values().stream().filter(i -> i > 1).count();

        //frequencyMap.values().stream().forEach(System.out::println);

        List<Integer> duplicates = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("The duplicates in the array are: " + duplicates);

        System.out.println("The number of duplicates in the array is: " + duplicateCount);

    }
}
