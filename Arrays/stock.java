public class stock {
    public static int stok(int[] arr){
        int bp= Integer.MAX_VALUE, maxp = 0;
        
        for(int i= 0; i<arr.length;i++){
            if(arr[i]>bp){
                int profit = arr[i]-bp;
                maxp = Math.max(maxp, profit);
            }else{
                bp = arr[i];
            }
        }
        return maxp;
    }

    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        System.out.println(stok(arr));
    }
}
