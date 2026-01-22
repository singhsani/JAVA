public class Main {
    public static void main(String []args) {
        VARARG vararg=new VARARG();
//       vararg.varArg();
//      vararg.varArg(10);
      //  vararg.varArg(10,10,10);
        vararg.varArgWithArray(new int[]{10,20,30},new int[]{10,20,30});
    }
}