
public class checking {
    public static void rec(int arr[]){
        int f = 0, l = arr.length-1;

        while(f<l){
            int temp = arr[l];
            arr[l]= arr[f];
            arr[f]=temp;
            f++;
            l--;
        }
    }    

    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        rec(arr);
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
