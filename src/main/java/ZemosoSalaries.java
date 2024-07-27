import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ZemosoSalaries {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(20000,35000,15000,10000);

        //function to find salaries less than 20000 and increement them by 10%
        List<Double> collect = salaries.stream().filter(salary -> salary < 20000).map(salary -> salary + salary * 0.1).collect(Collectors.toList());
        System.out.println(collect);


        //funtion to write a map and get the names who have Course1
        HashMap<String,String> map = new HashMap<>();
        map.put("Sameer","Course1");
        map.put("Sumit","Course2");
        map.put("Amit","Course1");
        map.put("Ajith","Course3");

        map.entrySet().stream().filter(e -> e.getValue().equals("Course1")).map(e-> e.getKey()).forEach(System.out::println);
    }
}
