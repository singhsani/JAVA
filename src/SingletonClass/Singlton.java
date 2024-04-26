package SingletonClass;

/**
 * create private constructor
 * create factory method
 * advantage of singleton class better performance will be improved ,memory Utilization
 *
 */

public class Singlton {
    private static Singlton singlton=null;
    private Singlton(){}
    //factory method
    public static Singlton getSinglton(){
        if(singlton==null){
            singlton=new Singlton();
        }
        return singlton;
    }

    public static void main(String[] args) {
        System.out.println(Singlton.getSinglton().hashCode());
        System.out.println(Singlton.getSinglton().hashCode());
        System.out.println(Singlton.getSinglton().hashCode());
        System.out.println(Singlton.getSinglton().hashCode());
        System.out.println(Singlton.getSinglton().hashCode());
        System.out.println(Singlton.getSinglton().hashCode());
    }
}
