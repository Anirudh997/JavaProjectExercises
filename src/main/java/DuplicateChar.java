import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateChar {
    public static void main(String[] args) {
        String s ="abcdeefc";
        Stream<String> s1 = Stream.of(s);
        Set<String> set = new HashSet<>();
        List<String> s2 = s1.filter(c -> !set.add(c)).collect(Collectors.toList());
        System.out.println(s2);
        StringBuilder sb = new StringBuilder("");

    }
}
