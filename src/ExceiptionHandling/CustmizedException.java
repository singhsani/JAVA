package ExceiptionHandling;

import java.util.concurrent.CompletionException;

public class CustmizedException extends CompletionException {
    public static void main(String[] args) throws Exception {
        /**
         * abnormal code
         * line 10 handle code using try catch
         * after handle exception remaining code excute normally
         */
       // System.out.println(10/0);//this line disturb code flow
        String str="";
        try{
            //str.charAt(3);
            System.out.println(10/0);
        } catch(ArithmeticException e){
            throw new ArithmeticException("denomi");
        }
        System.out.println("Risky code handled using above codes");
    }
}
