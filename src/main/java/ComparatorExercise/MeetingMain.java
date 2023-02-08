package ComparatorExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeetingMain {
    public static void main(String[] args) {
        Meeting m1 = new Meeting(1,"maths","Monday",400);
        Meeting m2 = new Meeting(4,"Physics","Friday",700);
        Meeting m3 = new Meeting(5,"Physics","Thursday",1400);
        Meeting m4 = new Meeting(2,"Chemistry","Wednesday",1335);

        //Checking Final method exercise
        Teacher t1 = new Teacher();
        t1.setA(5);

        t1.show();
        System.out.println(t1.getA());

        t1.setA(7);
        System.out.println(t1.getA());

        Teacher t2 = new Teacher();
        t2.setA(6);
        t2.show();

        System.out.println(t2.getA());
        // EOL

        List<Meeting> list= new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        MeetingComparator mc = new MeetingComparator();

        System.out.println(list);
        System.out.println("--------------------------");

        Collections.sort(list,mc);
        System.out.println(list);
    }
}
