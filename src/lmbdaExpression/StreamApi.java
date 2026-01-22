package lmbdaExpression;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

/** Hum ye topics cover karenge:
 Stream Pipeline Deep
* Intermediate vs Terminal operations
* map vs flatMap advanced
* filter vs peek
* reduce()
* collect() advanced
* groupingBy, partitioningBy
* parallelStream
* Custom objects pe stream
 **/

public class StreamApi {

    public static void main(String[] args) {
        //Stream Pipeline Deep Concept
        /**
         * Ye 3 stage me kaam karta hai:
         * Source -:list
         * Intermediate operations
         * Terminal operation
         *
         * Rule-: Stream tab tak execute nahi hota jab tak terminal operation na ho
         */

        List<Integer> list= Arrays.asList(1,2,3,4,5);
        list.stream().filter(i-> i%2==0)
                .map(i->i*2) //intermediate operation
                .forEach(System.out::println); //terminal operation


        /**
         * Intermediate operation
         * filter()
         * map()
         * flatMap()
         * distinct()
         * sorted()
         * peek()
         * limit()
         * skip()
         */

        /**
         * Terminal Operation
         * forEach()
         * collect()
         * reduce()
         * count()
         * findFirst()
         * anyMatch()
         */

        /** map vs flatMap
         * The primary difference is the return type of the transformation function.
         * map: Takes a value $x$ and returns a new value $y$.
         * Signature: f: T ---> R
         * Result: Stream<T> becomes Stream<R>.
         * flatMap: Takes a value $x$ and returns a new container (Stream, Optional, Promise) of values.
         * Signature: f: T --> Stream<R>
         * Result: Stream<T> becomes Stream<Stream<R>>, which is then "flattened" into Stream<R>.
         */

        //flatMap
        List<List<Integer>> list1 = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        List<List<Integer>> data=list1.stream().map(x->x).collect(Collectors.toList());
        System.out.println(data);

       List<Integer> arr= list1.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());


       arr.forEach(System.out::println);

       //map
        List<String> names = Arrays.asList("a","b","c");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        //filter vs peek
        //Condition based processing
        //Stream ko modify karta hai
        System.out.println("filter vs peek....");
         list.stream().filter(x-> x%2==0)
                 .forEach(System.out::println);

        //peek
        //Debugging ke liye
        //Data change nahi karta
        //.peek(System.out::println)
        list.stream().filter(x-> x%2==0)
                .peek(e-> System.out.println("filter vs peek"))
                .forEach(System.out::println);

    }
}
