package array;

import java.util.Arrays;

public class ArrayIsSorted {
    public static boolean isSorted(int[] arr){
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
