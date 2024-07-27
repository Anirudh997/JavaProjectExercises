package companies;

import java.util.*;
/*
Finding most common word in a paragraph after banned word
 */

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {

        if(paragraph== null || paragraph.isEmpty()) return paragraph;

        String[] paragraph1 = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
        List<String> bandList = Arrays.asList(banned);

        Map<String,Integer> cache = new HashMap<>();
        for(String word: paragraph1){
            if(!bandList.contains(word)){
                cache.put(word, cache.getOrDefault(word,0)+1);

            }

        }
        //cache.entrySet().forEach(System.out::println);


        return  cache.entrySet().stream().sorted((e1,e2)->e2.getValue()- e1.getValue()).findFirst().get().getKey();
    }

    public static void main(String[] args) {

        MostCommonWord mostCommonWord = new MostCommonWord();
        String[] banned = {"hit"};

        System.out.println(mostCommonWord.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",banned ));

    }
}
