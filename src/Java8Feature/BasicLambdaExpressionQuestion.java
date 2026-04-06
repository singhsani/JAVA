package Java8Feature;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class BasicLambdaExpressionQuestion {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(1,2,3,4,5,6,7,8);
        // find only even no.
        data.stream().filter(x-> x%2==0).forEach(System.out::println);
        //find sum of only even no.
        //reduce(identity, accumulator) ? stream ko single value mein convert karta hai.
       Integer sum= data.stream().filter(x-> x%2==0).reduce(0,(a,b)-> a+b);
        System.out.println(sum);
        //find sum of odd no.
       Integer oddSum=data.stream().filter(x-> x%2!=0).reduce(0,(a,b)->a+b);
        System.out.println(oddSum);
        //find quare of each no.
        //map(Function) ? har element ko transform karta hai
        List<Integer> sq=data.stream().map(x-> x*x).collect(Collectors.toList());
        sq.forEach(System.out::print);
        List<String> str=Arrays.asList("Hello","how","what","Why");
        List<String> upStr=str.stream().map(String::toUpperCase).collect(Collectors.toList());
        upStr.forEach(System.out::println);

        List<String> loStr=str.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(loStr);

        //List<Integer> to List<String>
        List<String> convert=data.stream().map(x-> String.valueOf(x)).collect(Collectors.toList());
        System.out.println(convert);
        //max value
        Integer max=data.stream().max(Integer::compareTo).orElse(null);
        System.out.print(max);
        //min value
        Integer min=data.stream().min(Integer::compareTo).orElse(null);
        System.out.println(min);
        // list to set
        Set<Integer> set=data.stream().collect(Collectors.toSet());
        System.out.println(set);
        // filter to collect
        Long grater=data.stream().filter(x-> x>2).count();
        System.out.println(grater);
        /**
         * collect() ? stream result ko Map/List me convert karta hai
         * toMap(keyMapper, valueMapper, mergeFunction)
         * keyMapper ? key kaise banega
         * valueMapper ? value kya hogi
         * mergeFunction ? duplicate key aayi to kya kare
         */
        Map<Integer,String> map=str.stream().collect(Collectors.toMap(
                s-> s.length(),
                s-> s,
                        (oldval,newVal)->oldval
        ));
        System.out.println(map);
        /**
         * Comparator.comparing() ? kis field pe compare karna hai
         * max() ? highest object return
         * orElse() ? null handling
         */
        //get Employee Max salary
        // Employee=emplist.stream().max(Comprator.comparing(Employee::getSalary()).orElse(null);

        //flatMap
        List<List<Integer>> flmap=Arrays.asList(Arrays.asList(1,2,3,4),Arrays.asList(2,4,6,8));
        List<Integer> single=flmap.stream().flatMap(l-> l.stream()).collect(Collectors.toList());
        System.out.println(single);



    }
}
