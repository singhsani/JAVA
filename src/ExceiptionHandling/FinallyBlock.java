package ExceiptionHandling;

/**
 * without try block finally block not exits
 * without try block using finally throw compile time exception
 * only one situation where finally block not executed if user use System.exit(0);
 * if return statement in try catch and finally block always finally block return statement consider
 */
public class FinallyBlock {
    public static void main(String[] args) {

//        finally{
//            System.out.println("Hello"); wrong declaration
//        }
        try{
            System.out.println(10/0);
            /**
             * not recommended
             * because there are no gureenty code will properly execute inside try block
             */
            try{
//                staement 1;
//                statement 2;
//                .
//                .
//                .
            }catch (Exception e){

            }finally {

            }
        }catch(Exception e){

        }
        /**
         * finally block inside catch block is not recommended
         */

        try{

        }catch(Exception e) {
            try{

                 }catch(Exception ex){

            }
        }


        try{
            System.out.println("Hello");
            System.out.println(10/0);
        }catch (StringIndexOutOfBoundsException se){
            System.out.println(10/0);
        }finally {
            System.out.println("Hello finally");
        }
        System.out.println("end");
    }
}
