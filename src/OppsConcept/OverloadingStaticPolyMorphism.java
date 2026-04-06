package OppsConcept;

/**
 * Overloading ko Compile-time Polymorphism ya Static Binding isliye kehte hain kyunki compiler method
 * signature (Name + Parameters) ko dekh kar hi tay kar leta hai ki kaunsa method call hoga.
 *
 * Return Type ka Role: Sirf return type badal dene se overloading nahi hoti.
 * Agar method ka naam aur parameter same hain aur sirf return type alag hai,
 * toh compiler "Ambiguity Error" dega. Kyun? Kyunki call karte waqt obj.sum(10, 20)
 * ko kaise pata chalega ki use int wala chahiye ya double wala?
 *
 * Best Explanation: Overloading ke liye Method Signature ka badalna
 * compulsory hai (Number of params, Type of params, ya Order of params).
 */

public class OverloadingStaticPolyMorphism {

    public static int sum(int x,int y){
      return x+y;
    }
    public static int sum(int x,int y,int z){
        return x+y+z;
    }

    public static long sum(long x,int y){
        return x+y;
    }

    public static void main(String[] args) {
        int sum=sum(12,13);
        System.out.println(sum(12,12,14));
        System.out.println(sum(10l,30));
    }
}
