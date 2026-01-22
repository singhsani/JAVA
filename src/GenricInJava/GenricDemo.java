package GenricInJava;

/**
 *
 * @param <T>
 *     using Generic for type safety purpose
 */
class Test<T>{
    T obj;
    Test(){

    }
    Test(T obj){
        this.obj=obj;
    }
    public T getObj(){
        return obj;
    }
}
public class GenricDemo <T>{
    public static void main(String[] args) {
        Test t=new Test(10);
        System.out.println(t.getObj());
        Test t1=new Test("String");
        System.out.println(t1.getObj());
    }
}

