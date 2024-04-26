package Array;

public class SingleDimentional {
    public static void main(String[] args) {
//        int[] arr=new int[]; invalid ) must be declaration at a time
        int[] arr={};//valid  but it is recommended
        int ar[]=new int[3];//valid
        int a [] =new int[4];
        System.out.println(arr.getClass());
        /**
         * Two dimensional array
         * All valid combination
         *         int[][] p;
         *         int[]  [] d;
         *         int[] e[];
         *         int [][]f ;
         *         int v[][];
         *         int []z[];
         */
       // int[][] ta=new int[][]; must be declaration at a time we can't declare size at the time then we will get compile time error
        int[] aa,bb;
        aa=new int[4];
        bb=new int[4];
        int[] aaa[],bbb;
        aaa=new int[4][];
        bbb=new int[5];
        int[] []aaaa,bbbb;
        aaaa=new int[4][];
        bbbb=new int[5][];
        System.out.println(aa.getClass()+" "+bb.getClass());
        System.out.println(aaa.getClass()+" "+bbb.getClass());
        System.out.println(aaaa.getClass()+" "+bbbb.getClass());

    }
}
