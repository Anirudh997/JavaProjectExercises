package codingProbs;
/*
 * This program prints set of anagrams together in given string
 *
 * eg.
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagram {
    static String input = "cat dog tac sat tas god dog";

    static void setOfAnagrams(String inputString){

        //your code goes here
        List<String> words = Stream.of(inputString.split(" ")).collect(Collectors.toList());
        while(words.size()>0){
            StringBuilder sb = new StringBuilder(words.get(0));
            if(words.contains(sb.reverse().toString())){
                System.out.print(" " + words.get(0)+ " " + sb);
                words.remove(words.get(0));
                words.remove(sb.reverse().toString());
            }else{
                words.remove(words.get(0));
            }
        }

    }


    public static void main(String[] args) {

        //String input = "cat dog tac sat tas god dog";
        setOfAnagrams(input);

    }
}
