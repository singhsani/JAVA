package MapDemo;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumberUsingMap {
    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=17;
       int[] result= sumOfTwoNumberUsingMap(arr,target);
       for(int a:result){
           System.out.println(a);
       }
    }

    private static int[] sumOfTwoNumberUsingMap(int[] arr, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return new int[]{map.get(arr[i]),i};
            }else{
                map.put(target-arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
