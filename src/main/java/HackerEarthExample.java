import java.io.FileReader;

public class HackerEarthExample {
    public static void main(String[] args) {
        int product=1;
        int a=1;
        int c=0;

        while(++product<3){
            int b=(1+2*product)%3;
            c=(2*product)%3;
            switch (c)
            {
                default:
                case 0:
                    a++;
                    break;
                case 1:
                    a+= ++a - b-- + ++b;
            }
        }
        System.out.println(a+c);

    }
}
