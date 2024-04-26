package Interface;

/**
 * Interface Releated Example
 * method in interface implement two type
 * all methods implement into child class
 * if user want to partial implementation then use abstract class
 */
interface inter{
    void m();
    void m2();
}

/**
 * First way to implement the method of interface
 */
class Test1 implements inter{
    @Override
    public void m(){
        System.out.println("First Way of implementation");
    }
    @Override
    public void m2(){
        System.out.println("First Way of implementation");
    }

}

/**
 * Second way of implementation
 *
 */
abstract class Test2 implements inter{
    @Override
     public void m(){
        System.out.println("Hello");
    }
}
class Test3 extends Test2{
    @Override
    public void m2(){
        System.out.println("World");
    }
}
public class InterfaceReleatedExample {
    public static void main(String[] args) {
//        Test2 test2=new Test3();
//        test2.m();
//        test2.m2();
        Test3 test1=new Test3();
        test1.m2();
        test1.m();
    }
}
