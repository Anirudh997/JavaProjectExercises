package ComparatorExercise;

import java.util.Comparator;

public class MeetingComparator implements Comparator<Meeting> {
    private int a =0;
    private int b =0;
    @Override
    public int compare(Meeting o1, Meeting o2) {
        if((o1.getDay()).equalsIgnoreCase("monday")){
            a=1;
        }
        if((o1.getDay()).equalsIgnoreCase("tuesday")){
            a=2;
        }
        if((o1.getDay()).equalsIgnoreCase("wednesday")){
            a=3;
        }
        if((o1.getDay()).equalsIgnoreCase("thursday")){
            a=4;
        }
        if((o1.getDay()).equalsIgnoreCase("friday")){
            a=5;
        }
        if((o1.getDay()).equalsIgnoreCase("saturday")){
            a=6;
        }
        if((o1.getDay()).equalsIgnoreCase("sunday")){
            a=7;
        }

        if((o2.getDay()).equalsIgnoreCase("monday")){
            b=1;
        }
        if((o2.getDay()).equalsIgnoreCase("tuesday")){
            b=2;
        }
        if((o2.getDay()).equalsIgnoreCase("wednesday")){
            b=3;
        }
        if((o2.getDay()).equalsIgnoreCase("thursday")){
            b=4;
        }
        if((o2.getDay()).equalsIgnoreCase("friday")){
            b=5;
        }
        if((o2.getDay()).equalsIgnoreCase("saturday")){
            b=6;
        }
        if((o2.getDay()).equalsIgnoreCase("sunday")){
            b=7;
        }

        if(a<b){
            return -1;
        }else if(a>b){
            return 1;
        }
        return 0;
    }
}
