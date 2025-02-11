
import java.util.*;
public class max_in_array {
    public static void max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,6,5,10};
        max(arr);
    }    
}
