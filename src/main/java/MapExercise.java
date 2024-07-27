import jdk.nashorn.internal.parser.JSONParser;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,200);
        Employee e2 = new Employee(2,400);

        Map<String, Object> map = new HashMap<>();
        map.put("emp1", e1);
        map.put("emp2",e2);

        String str = map.toString();
        System.out.println(map.toString());

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
