import java.util.Arrays;

public class KthMinZemoso {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] input = new int[arr.length * arr[0].length];

        int k=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                input[k] = arr[i][j];
                k++;
            }
        }



        Arrays.stream(input).forEach(System.out::print);

        int array_too_small = Arrays.stream(input).sorted().limit(5).skip(4).findFirst().orElseThrow(() -> new IllegalArgumentException("Array too small"));
        System.out.println(array_too_small);
    }
}
