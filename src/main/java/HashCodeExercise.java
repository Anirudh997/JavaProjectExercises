import java.util.HashMap;
import java.util.Map;

class Employee{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HashCodeExercise {
    public static void main(String[] args) {

        Employee emp = new Employee(1,"Rahul");
        System.out.println(emp.hashCode());

        Employee emp1 = new Employee(1,"Rahul");
        System.out.println(emp1.hashCode());

        Map<Employee,String> map = new HashMap<>();
        map.put(new Employee(1,"Rahul"),"Bangalore");
        map.put(new Employee(1,"Rahul"),"Bangalore");
        map.put(new Employee(1,"Rahul"),"Singapore");

        System.out.println(map);

    }
}
