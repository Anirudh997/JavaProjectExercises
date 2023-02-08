import java.util.Arrays;

public class LoveBabar25 {
    public static void main(String[] args) {

        //Rearrange array in -ve , +ve with O(n)

        int[] a ={1,-1,24,22,-54,-34};
        /*
         1 2 3 -3 -12 34 55 -11
         1 -3 3 2 -12 34 55 -11
         1 -3
         */
        Arrays.stream(rearrangingPosNeg(a)).forEach(System.out::println);
        //Arrays.stream(a).sorted().forEach(System.out::println);
    }
    static int[] rearrangingPosNeg(int[] a){
        int x=0,y=1;
        while(y<a.length) {
            if(a[x]>0 && a[y]>0 || a[x]<0 && a[y]<0)
                y++;
            if(a[x]>0 && a[y]<0){
                int temp = a[y];
                a[y]=a[x];
                a[x]=temp;
                y=x+3;
                x=x+2;
                continue;
            }
            if(a[x]<0 && a[y]>0){
                int temp =a[x+1];
                a[x+1]=a[y];
                a[y]=temp;
                y=x+3;
                x=x+2;
                continue;
            }
        }
        return a;
    }
}
