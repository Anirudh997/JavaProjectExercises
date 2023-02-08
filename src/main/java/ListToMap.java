import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        createEmployee(employees);

        //Command to get Map of City and associated list of Employees
        Map<String, List<Employee>> result = employees.stream().collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(result);

        //Command to convert list to Map
        Map<String, String> map = employees.stream().collect(Collectors.toMap(Employee::getName, Employee::getDivision));

        System.out.println(map.size());
    }

    static void createEmployee(List<Employee> employeeList){
        employeeList.add(new Employee("Anirudh","Rajahmundry","Developer"));
        employeeList.add(new Employee("Luffy","Hyderabad","Sales"));
        employeeList.add(new Employee("Zoro","Hyderabad","Developer"));
        employeeList.add(new Employee("Abhinav","Rajahmundry","Sales"));
    }

    static class Employee{

        private String name;
        private String city;
        private String division;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public Employee(String name, String city, String division) {
            this.name = name;
            this.city = city;
            this.division = division;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", division='" + division + '\'' +
                    '}';
        }
    }
}
