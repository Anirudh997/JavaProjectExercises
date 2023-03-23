import java.io.FilenameFilter;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> greater = (a, b) -> a > b;
        System.out.println(greater.test(1,3));

        BiConsumer<Integer,Integer> addition = (a, b) -> System.out.println(a+b);
        addition.accept(5,3);
    }
}
