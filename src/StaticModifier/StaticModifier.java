package StaticModifier;

/**
 * static modifier
 * we can't declare static class but inner is declared as static class
 *
 */
public class StaticModifier {
    static class A{

    }

}
/**
 * static modifier allow for block,method and variables
 * static variable a single copy will be created at class level
 * instance variable accessed only instance area we can't access in static variable directly
 */
class StaticApplicableFor{
    static{
        int a;
        int b;
    }
    static int x;
    public static void print(){
        System.out.println("Hello");
    }
}
