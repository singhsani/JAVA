package Java8Feature;

import java.util.*;

/**
 * Array initialization
 * int[] arr = new int[] {1, 2, 3, 4, 5, 6};
 * Or even shorter (recommended):
 * int[] arr = {1, 2, 3, 4, 5, 6};
 *
 *
 List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
 2? Using List.of() (Java 9+)
 List<Integer> arr = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
 *
 */

public class CodingQuestion {

    public static void main(String[] args) {
        List<Integer> arr= new ArrayList<>(Arrays.asList(1, 8, 3, 9, 5, 6));
        // sirf ascending order ke liye
        Collections.sort(arr);
        //sirf ascending order ke liye
        arr.sort(Integer::compareTo);
        Collections.sort(arr,(a,b)-> b.compareTo(a));
        arr.remove(1);
        arr.forEach(a-> System.out.println(a));
    }

}
