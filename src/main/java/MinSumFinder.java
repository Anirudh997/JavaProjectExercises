import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSumFinder {

    public static int findMinSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int max = arr[n - i - 1];
            int min = arr[i];
            int diff = max - min;
            sum += diff;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 1, 2};
        int[] arr2 = {2, 1, 3};

        System.out.println(getAllCombinations(arr1));
    }

    public static List<List<Integer>> getAllCombinations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        getAllCombinationsHelper(arr, new ArrayList<Integer>(), result);
        return result;
    }

    private static void getAllCombinationsHelper(int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!current.contains(arr[i])) {
                current.add(arr[i]);
                getAllCombinationsHelper(arr, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
