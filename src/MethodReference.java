package TestProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static java.lang.System.*;

/**
 * There are three type of Method Reference
 * -> static method reference
 * ->  Instance Method References of a Particular Object
 * -> Instance Method References of an Arbitrary Object of a Particular Type
 */
public class MethodReference {
    public static void main(String[] args) {
        List<String> word= Arrays.asList("Java","Jay","Ajay","Ram");
        // Static Method Reference: Converting all strings to uppercase
        List<String> upperCase=word.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Instance Method Reference of an Arbitrary Object of a Particular Type
        upperCase.forEach(System.out::println);

        // Constructor Reference: Creating new instances
        Supplier<List<String>> listSupplier = ArrayList::new; // constructor reference
        List<String> newList = listSupplier.get();
        newList.addAll(word);
        out.println(newList);

        // Additional Example: Using Function Interface for Constructor Reference
        Function<String, Integer> stringToInteger = Integer::new; // constructor reference
        Integer number = stringToInteger.apply("100");
        System.out.println("String to Integer: " + number);


    }

}
