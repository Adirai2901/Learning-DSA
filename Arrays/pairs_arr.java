public class pairs_arr {
    public static void pair(int arr[]){
        // int f = 0, s = 1;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int arr[]= {2,4,6,8,10};
        pair(arr);

    }
}
