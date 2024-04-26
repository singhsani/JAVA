package SingletonClass;

public class MultiTonClass {
    private static MultiTonClass m1=null;
    private static MultiTonClass m2=null;
    public static MultiTonClass getMultiTon(){
        if(m1==null)
            m1=new MultiTonClass();
        if(m2==null)
            m2=new MultiTonClass();
        if(Math.random()<0.5)
            return m1;
        else
            return m2;
    }

    public static void main(String[] args) {
        System.out.println(MultiTonClass.getMultiTon().hashCode());
        System.out.println(MultiTonClass.getMultiTon().hashCode());
        System.out.println(MultiTonClass.getMultiTon().hashCode());
        System.out.println(MultiTonClass.getMultiTon().hashCode());
    }
}
