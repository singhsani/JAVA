package Interface;

import java.io.Serializable;

/**
 * two different interface have same method like same name, same signature,same return,
 * Type then implementing class implement only one method
 *
 */

interface MethodNameingConflict{
    public int m();
}
interface MethodNameingConflict1{
    public int m();
}
interface MethodNameWithDifferentReturnType{
    public int m();
}
interface MethodNameWithDifferentReturnType1{
    public int m();
}
public class NamingConflict implements MethodNameingConflict,MethodNameingConflict1{
    /**
     * same signature method are allowed
     * but different signature same name are not allowed
     * @return
     */
    @Override
    public int m(){
        System.out.println("Hello");
        return 0;
    }

    public static void main(String[] args) {
        NamingConflict namingConflict=new NamingConflict();
        namingConflict.m();
    }
}
/**
 * same method name but di
 */
//public class NameingConflict implements MethodNameWithDifferentReturnType,MethodNameWithDifferentReturnType1{
//    @Override
//    public int m(){
//        return 0;
//    }
//}
