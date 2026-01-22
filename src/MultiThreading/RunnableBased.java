package MultiThreading;
class RunnableTest implements Runnable{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Hello");
        }
    }

}
public class RunnableBased {
    public static void main(String[] args) {
        RunnableTest runnableTest=new RunnableTest();
        Thread t=new Thread(runnableTest);
        t.start();
        for(int i=0;i<15;i++)
            System.out.println("World");
    }
}
