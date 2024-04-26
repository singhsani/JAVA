
 abstract class TestBigClass  {
    public void print(){
        System.out.println("Hello");
    }
    public abstract void print1();
    public abstract void print2();
}
abstract class TestClass1 extends TestBigClass{
    public abstract void print3();
}
public class TestClass extends TestClass1{
    @Override
    public void print3(){

    }
    public void print1(){

    }

    @Override
    public void print2() {

    }
}
