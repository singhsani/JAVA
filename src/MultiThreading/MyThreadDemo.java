package MultiThreading;

class ThreadTest extends Thread{
    public void run(){
        for(int i=0;i<9;i++){
            System.out.println("Hello");
        }
    }
}
public class MyThreadDemo {
    public static void main(String[] args) {
        ThreadTest test=new ThreadTest();
        System.out.println(Thread.currentThread().getName());
        Thread t=new Thread(test);
        t.start();
        t.setName("Hello");
        System.out.println(t.getName());
        for(int i=0;i<6;i++)
            System.out.println("World");
        System.out.println(Thread.MIN_PRIORITY);
    }
}
