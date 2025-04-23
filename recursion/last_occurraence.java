public class last_occurraence {

    public static int last(int[] arr, int x,int i){
        if(i == arr.length){
            return -1;
        }
        int found = last(arr, x, i+1);
        if(found == -1 && arr[i]== x){
            return i;
        }
        return found;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,5,5,4,5};
        System.out.println(last(arr, 5, 0));
    }
}
