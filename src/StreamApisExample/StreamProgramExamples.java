package StreamApisExample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamProgramExamples {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,13,14,15,16,17,18,19);

        list.stream().filter(s->s%2==0)
                .forEach(System.out::print);

        list.stream().filter(s-> s%2!=0)
                .forEach(System.out::print);

        int max=list.stream().max(Integer::compare).get();
        System.out.println("Max value  "+max);

        int min=list.stream().min(Integer::compare).get();
        System.out.println("Min Value  "+min);

        List<Integer> arr= Arrays.asList(12,23,14,15,36,47,88,19);
        arr.stream().map(m->m +"")
                .filter(f->f.startsWith("1"))
                .forEach(System.out::print);

        List<String> str=Arrays.asList("Ram","shyam","mohan","shohan","sita","Rita","Gita");
        str.stream().map(m->m.toLowerCase())
                .filter(f->f.startsWith("r"))
                .forEach(System.out::print);


        /**
         * Find Duplicate number
         */
        List<Integer> array=Arrays.asList(12,13,12,15,17,14,14,20,21,13);
        Set<Integer> set=new HashSet<>();
        List<Integer>newarr=array.parallelStream().filter(f-> !set.add(f)).collect(Collectors.toList());
        System.out.println(newarr);

        array.stream().findFirst()
                .ifPresent(System.out::print);

        long count=str.stream().count();
        System.out.println(count);

        /**
         * Given a String, find the first non-repeated character in it using Stream functions?
         */
        String input="java is a awesome programming language";
        Character result=input.chars()
                .mapToObj(m->Character.toLowerCase(Character.valueOf((char) m)))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(f-> f.getValue() ==1L)
                .map(key->key.getKey())
                .findFirst().get();
        System.out.println(result);


    }
}
