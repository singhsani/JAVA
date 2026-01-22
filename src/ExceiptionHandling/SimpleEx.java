package ExceiptionHandling;

public class SimpleEx {
    public static void main(String[] args) {

        int x = value1();
        System.out.println(x);


    }

    private static int value1() {
        try {
            return 10/0;
        }
        catch(Exception e) {
            e.printStackTrace();
            return 20;
        }
        finally {
            return 30;
        }
    }
}
