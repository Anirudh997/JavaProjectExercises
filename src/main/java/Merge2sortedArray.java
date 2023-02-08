import java.util.Arrays;

public class Merge2sortedArray {
    public static void main(String[] args) {
        int[] a1 ={1,4,7,8,10};
        int[] a2 ={2,3,9};
        int[] val = new int[a1.length + a2.length];
        int m=0;
        for(int i=0; i<val.length;i++){
            if(i>=a1.length){
                val[i] = a2[m];
                m++;
            }else{
            val[i]=a1[i];}
        }
        m=0;
        Arrays.sort(val);

        for(int i=0; i<val.length;i++){
            if(i>=a1.length){
                a2[m] = val[i];
                m++;
            }else{
                a1[i]=val[i];}
        }

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
    }
}
