package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicatAndConsumerAndFunctionalUse {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Aman","Hello","Atul","harsh","Arman");

        /**
         * Predicate
         * Boolean-valued function hai. Iska Daam sirf ek hai: Kisi object ko check karna aur result mein true ya false dena
         *
         * predicate ka chainning
         * startWithA.and(endWithN).test(u)
         *
         * and(Predicate other): Do conditions ko jodne ke liye.
         * or(Predicate other): Dono mein se ek sahi ho.
         * negate(): Result ko ulta (invert) karne ke liye.
         */
        Predicate<String> startWithA=u-> u.startsWith("A");
        Predicate<String> endWithN=u-> u.endsWith("n");

        list.forEach(u->{
            if(startWithA.and(endWithN).test(u)){
                System.out.println(u);
            }
        });

        /**
         * Iska kaam hai: Ek type ka input lena (T) aur doosre type ka output dena (R).
         *
         * Function Chaining (Composition):
         * Isme do methods hote hain: andThen() aur compose(). Yahan interviewer aapko fasa sakta hai.
         * f1.andThen(f2): Pehle f1 chalega, fir uska result f2 mein jayega. (Sequential)
         * f1.compose(f2): Pehle f2 chalega, fir uska result f1 mein jayega. (Reverse)
         *
         * output:
         *  30
         *  20
         */
        Function<Integer,Integer> add = i-> i+10;
        Function<Integer,Integer> multi=i-> i*2;

        System.out.println(add.andThen(multi).apply(5));
        System.out.println(add.compose(multi).apply(5));

        /**
         * 2. Supplier<T> : The Lazy Generator
         * Supplier koi input nahi leta, sirf output deta hai. T get();
         *
         * Deep Level Use Case (Lazy Evaluation):
         * Spring Boot mein jab hum logging karte hain, toh hum nahi chahte ki expensive string concatenation tab ho jab log level "INFO" ho hi nahi.
         *
         * Interviewer Question: "Why use Supplier for Exception handling?" Answer: Optional.orElseThrow(() -> new ResourceNotFoundException()).
         * Yahan hum Supplier pass kar rahe hain. Iska fayda ye hai ki exception ka object tabhi create hoga jab zarurat hogi.
         * Agar user mil gaya, toh exception object kabhi heap memory mein banega hi nahi. Isse performance improve hoti hai.
         */


        /**
         * 2. "Kya hum 3 inputs (TriFunction) wala interface bana sakte hain?"
         *
         * Answer: Bilkul! Java 8 ne sirf common use cases ke liye interfaces diye hain (upto 2 inputs).
         * Agar aapki requirement 3 ya 4 inputs ki hai, toh aap apna Custom Functional Interface banayenge.
         */
        TriFunction<Integer, Integer, Integer, Integer> sumOfFunction=(a,b,c)-> a+b+c;

        Integer sum=sumOfFunction.apply(14,20,30);
        System.out.println(sum);

        /**
         * Agar aap 3 inputs ke liye naya interface nahi banana chahte, toh aap Function ko nest (chain) kar sakte ho
         */
        Function<Integer,Function<Integer,Function<Integer,Integer>>> sumbi=a->b->c-> a+b+c;

        int total=sumbi.apply(10).apply(20).apply(30);
        System.out.println(total);


    }
}
