import java.util.*;

public class LinkedListExercise {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.add(-2);
        list.add(1);
        list.add(0);
        list.add(4);
        list.add(3);
        list.add(4);

        list.add(1,34);

        System.out.println(list);

        List<Integer> arrList = new ArrayList<>();
        arrList.add(12);
        arrList.add(5);
        arrList.add(12);
        arrList.add(40);
        arrList.add(13);
        arrList.add(5);

        List<Integer> arrList1 = new ArrayList<>();
        arrList1.add(12);
        arrList1.add(5);
        arrList1.add(13);
        arrList1.add(41);
        arrList1.add(14);
        arrList1.add(5);

        boolean b = arrList .retainAll(arrList1);
        System.out.println(b);

        List<Integer> list1 = arrList.subList(1, arrList.size());
        System.out.println(arrList);
        System.out.println(arrList1);
        //System.out.println(list1);

        //To search the element get the position
        int search = Collections.binarySearch(arrList,12);
        //System.out.println(search);

        //print no of duplicates
        int frequency = Collections.frequency(list, 4);
        System.out.println(frequency);

        /*ListIterator<Integer> it = arrList.listIterator();
        List<Values> newList = new ArrayList<>();

        Integer max = Collections.max(arrList);
        //System.out.println(max);

        while(it.hasNext()){
            if(!newList.contains(it.next())){
                Values val = new Values();
                val.setKey(it.next());
                val.setCount(Collections.frequency(arrList, it.next()));
                newList.add(val);
            }
        }*/

        int a = 1100;

        String s = String.valueOf(1100);
        System.out.println(s);

        String str = "567890";
        int i = Integer.parseInt(str);
        System.out.println(i);

        int count=0;
        char[] chars = str.toCharArray();
        for(int m=0; m<chars.length; m++){
            count = count + chars[m];
        }
        System.out.println(count);

        String val ="";
        String[] split = str.split("");
        for(int m=0; m<split.length; m++){
            val = val + split[m] + " a ";
        }
        System.out.println(val);

    }
}

class Values{
    private int key;
    private int count;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
