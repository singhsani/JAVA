package Array;

import java.util.Arrays;

import static java.util.Collections.swap;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr={12,9,3,8,5,6,7};
        int kthlargest=getKthLargest(arr,2);
        System.out.println(kthlargest);

        // using quick sort
       int klQs= kThLargestUsingQuickSort(arr,0,arr.length-1,arr.length-3+1);
        System.out.println(klQs);
    }

    private static int kThLargestUsingQuickSort(int[] arr, int start, int end ,int k) {
        if(k<1 || arr == null){
            return 0;
        }
        int pivot=arr[end];
        int left=start;
        int right=end;

        //Partition Logic (Core of Algorithm)
        while(true){
            //Moves left until it finds a value ? pivot
            while (arr[left]<pivot && left<right){
                left++;
            }
            //Moves right until it finds a value < pivot
            while (arr[right]>=pivot && right>left){
                right--;
            }
            if(left == right){
                break;
            }
            swaps(arr,left,right);

        }
        //Final Pivot Placement
        swaps(arr,left,end);

        //Recursive Calls (Only ONE side)
        if(k==left+1){
            return pivot;
        }else if(k<left+1){
           return kThLargestUsingQuickSort(arr,start,left-1,k);
        }else{
          return  kThLargestUsingQuickSort(arr,left+1,end,k);
        }
    }

    private static void swaps(int[] arr, int left, int right) {
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    // basic way
    private static int getKthLargest(int[] arr ,int k) {
        Arrays.sort(arr);
        return arr[arr.length-k];
    }


}
