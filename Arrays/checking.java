
public class checking {
    public static void bubble(int arr[]){
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = 0 ; j <arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]= temp;
                }
            }
        }

        for(int i = 0 ; i <arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,2,3,1};
        bubble(arr);
    }
}
