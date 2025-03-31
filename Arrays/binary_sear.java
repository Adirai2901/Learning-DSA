public class binary_sear {

    public static int binary(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[] = { -1, 0, 3, 4, 5, 9, 12 };

        System.out.println(binary(arr, 5));

    }
}
