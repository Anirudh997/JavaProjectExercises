import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        int numRows=5;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        for(int i=0;i<numRows;i++){
            list.add(list1);
            list1 = getInnerList(list1);
        }
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
    }

    static List<Integer> getInnerList(List<Integer> result){
        List<Integer> innerlist = new ArrayList<>();
        innerlist.add(1);
        for(int i =1;i<=result.size();i++){
            if(i<result.size()){
                int count = result.get(i)+result.get(i-1);
                innerlist.add(count);
            }
            if(i==result.size()){
                innerlist.add(1);
            }
        }
        return innerlist;
    }
}
