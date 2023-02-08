import java.util.Comparator;
import java.util.TreeMap;

class TreeMapExercise{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAddress("Rajahmundry");
        s1.setId(1);
        s1.setName("Anil");
        s1.setGroup("MPC");

        Student s2 = new Student();
        s2.setAddress("Vizag");
        s2.setId(2);
        s2.setName("Xavier");
        s2.setGroup("BPC");

        Student s3 = new Student();
        s3.setAddress("Hyd");
        s3.setId(3);
        s3.setName("Lavanya");
        s3.setGroup("BPC");

        TreeMap<String,Student> mp = new TreeMap<String,Student>((String o1, String o2) -> {
            if (o1.length() < o2.length())
                return -1;
            if (o1.length() > o2.length())
                return 1;
            return 0;
        });
        mp.put(s1.getAddress(),s1);
        mp.put(s2.getAddress(),s2);
        mp.put(s3.getAddress(),s3);

        Student student = mp.get(s1.getAddress());
        System.out.println("Student details - " + student);
        System.out.println(mp);

    }


}

class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String group;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int compareTo(Student o) {
        String address = o.getAddress();
        if(address.length() < this.address.length()){
            return -1;
        }else if(address.length()>this.address.length()){
            return 1;
        }
        return 0;
    }
}

