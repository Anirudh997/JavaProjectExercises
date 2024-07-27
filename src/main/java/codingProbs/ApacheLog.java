package codingProbs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ApacheLog {
    /**
     * Given a log file, return IP address(es) which accesses the site most often.
     */

    public static String findTopIpaddress(String[] lines) {
        // Your code goes here
        Map<String, Long> ipMap = Arrays.stream(lines).map(l -> l.substring(0, 8)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String key = ipMap.entrySet().stream().sorted((e1, e2) -> (int) (e2.getValue() - e1.getValue())).findFirst().get().getKey();
        return key;
    }


    public static void main(String[] args) {

        String lines[] = new String[] {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.1 - log entry 2 213",
                "10.0.0.2 - log entry 133132" };
        String result = findTopIpaddress(lines);

        if (result.equals("10.0.0.1")) {
            System.out.println("Test passed");

        } else {
            System.out.println("Test failed");

        }

    }
}
