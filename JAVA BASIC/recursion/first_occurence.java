public class first_occurence {

    public static int first(int[] arr, int x,int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==x){
            return i;
        }
        return first(arr, x, i+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,5,5,4,5,};
        System.out.println(first(arr, 5, 0));
    }
}
