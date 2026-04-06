package Java8Feature.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringQuestions {
    public static void main(String[] args) {
        //first non repeating characters
        String str="swiss";
        Character ch;
        ch = str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy( c-> c,LinkedHashMap::new,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(x-> x.getValue()==1)
                .map(x-> x.getKey())
                .findFirst()
                .get();

        System.out.println(ch);
        //second way to find non repeating character
        Character ch1=str.chars().mapToObj(c-> (char) c).filter(c-> str.indexOf(c)==str.lastIndexOf(c))
                .findFirst().get();
        System.out.println(ch1);

        Map<Character,Long> frequency=str.chars().mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(
                        c-> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        System.out.println(frequency);

        //reverse of string
        String revers=new StringBuilder(str).reverse().toString();
        System.out.println(revers);

        //remove duplicate
        String duplicate=str.chars().distinct().mapToObj(c-> String.valueOf((char) c)).collect(Collectors.joining());
        System.out.println(duplicate);

        //check is palindrome
        /**
         * range() ? index generate
         * allMatch() ? sab condition satisfy kare
         */
        String s="Aman";
        boolean isPalindrom= IntStream.range(0,s.length()/2)
                .allMatch(i-> s.charAt(i)==s.charAt(s.length()-i-1));
        System.out.println(isPalindrom);

       // Find longest word in sentence
        String word="I love java programming";
        String lword= Arrays.stream(word.split(" ")).max(Comparator.comparing(String::length)).orElse(null);
        System.out.println(lword);

        String w="Hello World";
        String countV="aeiou";
        Long v= w.toLowerCase().chars().filter(x-> "aeiou".indexOf(x) !=-1).count();
        System.out.println(v);

    }
}
