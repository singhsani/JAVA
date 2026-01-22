package Array;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        //rotate array
        rotateArray(arr,3);
        for(int a:arr){
            System.out.println(a);
        }

        //rotate array using bubble sort
        rotateArrayUsingBubbleSort(arr,3);
        for(int a:arr){
            System.out.println(a);
        }

        //divide and concur algorithm
        rotateArrayUsingDivideAndConcur(arr,3);

    }
    /* divide array into three part
    * array size 7 divide into three part 4 and 3
    * first 0 to 4
    * second 4 to 7
    * third 0 to 7
    * */
    private static void rotateArrayUsingDivideAndConcur(int[] arr, int i) {
        if(i>arr.length){
            i=i%arr.length;
        }
        int a=arr.length-i;
        divideAndConcur(arr,0,a-1);
        divideAndConcur(arr,a,arr.length-1);
        divideAndConcur(arr,0,arr.length-1);

    }
    /*
    * marge array
    * */
    private static void divideAndConcur(int[] arr, int left, int right) {
        if(arr ==null || arr.length==1){
            return;
        }
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    /* rotate array using bubble sort
    * */
    private static void rotateArrayUsingBubbleSort(int[] arr, int i) {
        for(int j=0;j<i;j++){
            for(int k=arr.length-1;k>0;k--){
                int temp=arr[k];
                arr[k]=arr[k-1];
                arr[k-1]=temp;
            }
        }
    }
    /*
    * simple way to rotate array
    * */
    private static void rotateArray(int[] arr, int i) {
        if(i>arr.length){
            i=i% arr.length;
        }
        int[] rotateArr=new int[arr.length];
        int m=0;
        for(int j=0;j<i;j++){
           rotateArr[m]=arr[arr.length-i+j];
           m++;
        }
        for(int k=0;k<arr.length-i;k++){
            rotateArr[m]=arr[k];
            m++;
        }
        for(int a:rotateArr){
            System.out.println(a);
        }
        //System.arraycopy(rotateArr,0,arr,0,arr.length);
    }
}
