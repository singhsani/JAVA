package Array;

/**
 * it is two-dimensional array we are using this approach for memory optimization
 *
 */
public class ArraysOfArray {
    public static void main(String[] args) {
        int[][][] arr=new int[3][2][];
        arr[0][0]=new int[2];
        arr[0][1]=new int[3];
        arr[1][0]=new int[4];
        arr[1][1]=new int[2];
        arr[2][0]=new int[3];
        arr[2][1]=new int[4];
//        arr[3]=new int[5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++)
                 arr[i][j][k]=k;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for(int k=0;k<arr[i][j].length;k++)
                   System.out.print(arr[i][j][k] + " ");
            }
            System.out.println();
        }

    }
}
