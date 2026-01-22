public class InstanceBlock {
    /**
     * if the value of variable varied from object to object that's called instance variable
     * *  initilization before constructor call
     * instance variable initialization inside instance block or constructor
     */
    int i;

    InstanceBlock(){

    }
{
    i=10;
    System.out.println(i);
}
    public static void main(String[] args) {
        InstanceBlock instanceBlock=new InstanceBlock();
        instanceBlock.i=30;
        System.out.println(instanceBlock.i);
        InstanceBlock instanceBlock1=new InstanceBlock();
        System.out.println(instanceBlock1.i);
        InstanceBlock instanceBlock2=new InstanceBlock();
        InstanceBlock instanceBlock3=new InstanceBlock();
        InstanceBlock instanceBlock4=new InstanceBlock();
    }
}
