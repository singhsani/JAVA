package Interface;

import java.io.Serializable;

interface A{

}
interface B{

}
/**
 * A class extends only one class at a time
 */
//class InterfaceVsEx extends A {
//
//}

/**
 * an interface extends multiple interface at a time
 */
interface C extends A,B{

}
class AToZ{

}

/**
 * A class can implement multiple interface at a time
 * Below the example
 */
class AToC implements A,B{

}

/**
 * A class can extend another class and can implement any number of interfaces simultaneously.
 */
class AToD extends AToZ implements A{

}
public class InterfaceVsExtends {
    public static void main(String[] args) {

    }

}
