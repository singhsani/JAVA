package Interface;



/**
 * every method present inside the interface is always public and abstract whether we are declaring or not.
 * public-: to make the method public because it is available to every implementing class.
 * abstract-:implementation class is responsible for providing an implementation.
 */
interface Method{
    void m();
    public void m1();
    public abstract void m2();
    abstract public void m3();
    abstract void m5();
    /**
     * As every interface method is always public and abstract we can't declare an interface method with the following modifiers.
     *     protected void m4(); invalid beacuse child class can't implement
     *     private void m5(); invalid out side class can't be access
     *     final void m6(); invalid beacuse final is constant is should be complete implementation
     *     protected abstract void m4(); invalid
     *     private  abstract void m5(); invalid
     *     final abstract void m6(); invalid
     *     static void m6(); invalid
     *     strictfp void m7(); invalid
     */
}
interface Variable{
    //int x; initilization should be compulsory
    //Every interface variable is always public static final whether we are declaring or not.
    int y=10;

}
public class InterfaceMethodAndVariable {
    public static void main(String[] args) {
        System.out.println(Variable.y);
    }
}
