import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Converting array to list
        int[] inarr = {1,2,3,5,5};
        List<Integer> collect = Arrays.stream(inarr).boxed().collect(Collectors.toList());
        System.out.println(collect);

        //second maximum
        int second_max = Arrays.stream(inarr).distinct().sorted().skip(inarr.length-2).findFirst().getAsInt();
        System.out.println("Second min in arr is " + second_max);

        //Map of numbers with count of its duplicates
        Map<Integer, Long> duplicates = collect.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(duplicates);
        duplicates.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).forEach(System.out::println);

        int asInt = Arrays.stream(inarr).max().getAsInt();
        System.out.println(asInt);

        //Converting list to array
        int[] ints = collect.stream().mapToInt(Integer::intValue).toArray();

        //Find Duplicate character in a String
        String word ="HelpMe";
        Map<Character, Long> frequencyMap = word.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Character character = frequencyMap.entrySet().stream().filter(e -> e.getValue() > 1).map(e->e.getKey()).findFirst().orElse(null);
        System.out.println(character);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,10000));
        employeeList.add(new Employee(2,50000));
        employeeList.add(new Employee(3,1000));
        employeeList.add(new Employee(4,25000));
        employeeList.add(new Employee(5,1500));
        employeeList.add(new Employee(6,11000));
        employeeList.add(new Employee(7,100000));

        employeeList.subList(0,2).clear();

        //Employes lists in desc order of salary
        List<Employee> EmpList = employeeList.stream().sorted((e1, e2) -> e2.salary - e1.salary).collect(Collectors.toList());
        System.out.println(EmpList);
        //List of salaries in desc order
        List<Integer> salaries = employeeList.stream().sorted((e1, e2) -> e1.salary - e2.salary).map(e -> e.salary).collect(Collectors.toList());
        System.out.println(salaries);
        //salaries greater than 20000
        employeeList.stream().map(e->e.salary+5000).filter(e->e>20000).forEach(System.out::println);

        BiFunction<Integer, String, String> biFunction = (a, b) -> "The value is " + a + " and the string is " + b;
        String apply = biFunction.apply(5, String.valueOf(6));
        System.out.println(apply);


    }


    static class Employee{
        private int id;
        private int salary;

        public Employee(int id, int salary){
            this.id=id;
            this.salary=salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", salary=" + salary +
                    '}';
        }
    }
}