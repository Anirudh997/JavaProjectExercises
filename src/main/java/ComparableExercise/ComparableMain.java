package ComparableExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Luffy","Monkey",24);
        Employee e2 = new Employee(2,"Sanji","Germa",34);
        Employee e3 = new Employee(3,"Zoro","Roronoa",33);

        List<Employee> ls= new ArrayList<>();

        ls.add(e1);
        ls.add(e2);
        ls.add(e3);

        Collections.sort(ls);
        System.out.println(ls);

    }
}
