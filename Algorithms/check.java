public class check {

    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void div(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        div(arr, si, mid);
        div(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    public static void merge(int[] arr, int s, int e, int mid){
        int[] temp = new int[e-s+1];
        int i = s; 
        int j = mid+1;
        int k = 0 ;

        while(i <= mid && j <= e){
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }
        while(i<= mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j <= e){
            temp[k]= arr[j];
            j++;
            k++;
        }

        for(k = 0 , i = s; k < temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr= {8,7,6,5,4,3,2};
        div(arr, 0, arr.length-1);
        printarr(arr);

    }
}
