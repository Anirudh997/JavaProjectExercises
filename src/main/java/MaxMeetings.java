import java.util.ArrayList;
import java.util.List;

public class MaxMeetings {
    public static void main(String[] args) {
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,5,7,9,9};
        List<Integer> list = new ArrayList<Integer>();
        int max=0, min=0;
        for(int i=0; i< start.length;i++){
            if(end[i]>start[i] && ((start[i] > max) || (end[i] < min || min ==0))){
                list.add(i+1);
                min = start[i];
                max= end[i];
            }
        }
        System.out.println(list);
    }
}
