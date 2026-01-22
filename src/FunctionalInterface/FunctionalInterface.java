package FunctionalInterface;

/**
 * functional interface only one abstract method
 * any no. of default and static method
 */

interface Interf{
    public abstract void m();
}

interface  A {
    public int m1(int a,int b);
}
public class FunctionalInterface {
    public void print(){
        Interf i=()->System.out.println("Hello");
        i.m();
        A x=(a,b)->{return a+b;};
        A y=(a,b)->{return a%b;};
        System.out.println(x.m1(6,6));
        System.out.println(y.m1(6,5));
    }
    public static void main(String[] args) {
        FunctionalInterface functionalInterface=new FunctionalInterface();
        functionalInterface.print();
    }

}
