package Array;

public class TwoSumEqualToTarget {

    public static void main(String[] args) {
        int[] arr={2, 6, 11, 15,7};
        int target=9;
        sumOfTwoNumberEqualTarget(arr,target);
    }

    private static void sumOfTwoNumberEqualTarget(int[] arr, int target) {
        int[] result=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j] == target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        for(int a:result){
            System.out.println(a);
        }
    }
}
