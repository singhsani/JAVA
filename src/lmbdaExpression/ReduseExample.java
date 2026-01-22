package lmbdaExpression;

import java.util.Arrays;
import java.util.List;

public class ReduseExample {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        //using reduce
        int sum=list.stream().reduce(0,(a,b)->a+b,Integer::sum);
        System.out.println(sum);
        int max=list.stream().reduce(0,Integer::max);
        System.out.println(max);
        int min=list.stream().reduce(1,Integer::min);
        System.out.println(min);
        int max1=list.stream().reduce(0,(a,b)-> a>b?a:b,Integer::max);
        System.out.println(max1);
        int min1=list.stream().reduce(1,(a,b)-> a<b?a:b);
        System.out.println(min1);

        //using direct
        int mi= list.stream().min(Integer::compare).get();
        System.out.println(mi);
        int mx=list.stream().max(Integer::compare).get();
        System.out.println(mx);
        List<Integer> list1 = Arrays.asList(1,2,3);

        list1.stream()
                .filter(x -> {
                    System.out.println("filter " + x);
                    return x>1;
                })
                .map(x -> {
                    System.out.println("map " + x);
                    return x*2;
                })
                .forEach(System.out::println);

        List<Integer> list3 = Arrays.asList(1,2,3);

        list3.stream()
                .peek(x -> x = x + 10)
                .forEach(System.out::println);

        list.stream()
                .peek(System.out::println)
                .forEach(x -> {});

        list.stream()
                .peek(System.out::println)
                .count();
    }
}
