package TestProgram;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lambda expression helps us to write our code in functional style. It provides a clear and concise way.
 */
public class LambdaExpression {
    public static void main(String[] args) {
        List<String> language= Arrays.asList("java","C++","jay","mango","ajay");
        filter(language,(str)-> str.contains("j"));

        System.out.println("--------Start forEach lambda expression-----------");
        //create a list
        List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);
        number.forEach(num-> System.out.print(num+" "));
        System.out.println();
        System.out.println();
        System.out.println("--------Start map and reduces lambda expression-----------");
        // reduce the sum of square using map
        Integer sumof= number.stream().map(x-> x*x)
                .reduce(0, Integer::sum);
        System.out.println(sumof);
    }
    public static void filter(List<String> str, Predicate<String> name){
        for(String names:str){
            if(name.test(names)){
                System.out.println(names);
            }
        }
    }
}
