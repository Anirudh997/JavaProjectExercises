package ComparableExercise;

import com.sun.deploy.util.StringUtils;

public class Employee implements Comparable<Employee>{

    public Employee(int id, String firstName, String lastName,int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age=age;
    }

    private int id;
    private String firstName;
    private String lastName;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Employee emp) {

        if(this.getLastName().charAt(0) > emp.getLastName().charAt(0)){
            return 1;
        }else if(this.getLastName().charAt(0) < emp.getLastName().charAt(0)){
            return -1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
