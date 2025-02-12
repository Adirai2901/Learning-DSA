
public class max_sub_array {
    public static void sub_arr(int arr[]) {
        int sum = 0, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("max = " + max);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 4, 6, 8, 10 };
        sub_arr(arr);

    }
}
