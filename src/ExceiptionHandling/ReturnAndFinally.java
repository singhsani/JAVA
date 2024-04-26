package ExceiptionHandling;

public class ReturnAndFinally {
    public static String print(){
        System.out.println("Hello");
        try{
            System.out.println("welcome to try block");
            return "try";
        }finally {
            System.out.println("welcome to finally");
            return "finally";
        }
    }
    public static void main(String[] args) {
        print();
    }
}
