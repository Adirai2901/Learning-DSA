
public class linear_ser {

    public static void search(int arr[],int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
        
        int arr[] = {10,9,8,7,6,5,4,3,2,1};
        search(arr, 9);
    }    
}
