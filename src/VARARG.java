/**
 * var-arg(variable no. of arguments method)
 * method(int... x) (valid)
 * method(int ...x) (valid)
 * method(int...x) (valid)
 * method(int .x..) (invalid)
 * method(int x...) (invalid)
 * if we mix var-arg parameter with general parameter then var-arg parameter should be
 * the last parameter.
 * example-: method(int x,int ...y)(valid call)
 * method(int x,int ...y,int z) (invalid call)
 * method(int ...x,int y) (invalid calls)
 * method(int ...x) internally convert into int[] x
 * anynamous array are also accepted  varArg(new int[]{10,20,30})
 */
public class VARARG {
    public static void varArg(int...x){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
    }
    public static void varArgWithArray(int[] ...x){
        for(int[] a:x){
            for(int y:a){
                System.out.println(y);
            }
        }
    }
}
