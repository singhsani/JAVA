package TestProgram;
interface Sayable{
    void m();
    default void m1(){
        System.out.println();
    }
}
interface hello{
    int m(int x,int y);
}
public class LambdaExpression2 {
    public static void main(String[] args) {
        Sayable s=()->{
            System.out.println("Hello Functional Interface");
        };
        s.m();
        s.m1();

        hello ss=(int a,int b)->{
            return a+b;
        };

        System.out.println(ss.m(2,4));
    }
}
