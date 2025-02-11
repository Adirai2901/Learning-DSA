import java.util.*;
public class min_in_array {
    public static void min(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,6,5,10};
        min(arr);
    }    
}
