public class _540_ {
    class Solution {
        public int singleNonDuplicate(int[] arr) {
            int s = 0;
            int e = arr.length-1;
    
            while(s < e){
                int mid = (s+e)/2;
    
                if (mid % 2 == 1) {
                    mid--;
                }
                if (arr[mid] == arr[mid + 1]) {
                    s = mid + 2;  
                } else {
                    e = mid;  
                }
            }
            return arr[s];
    
            }
    }
}
