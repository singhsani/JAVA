package ExceiptionHandling;

/**
 * flow of catch block child to parent
 * parent as a default exception handler
 * multiple catch block with single try block
 */
public class MultipleCatchBlock {
    public static void main(String[] args) {
        String str="";
        try{
            char ch=str.charAt(4);
        }catch(ArithmeticException a){
             a.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
        }catch (StringIndexOutOfBoundsException se){
            se.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
