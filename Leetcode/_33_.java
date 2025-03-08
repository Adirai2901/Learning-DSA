public class _33_ {
    class Solution {
        public int search(int[] nums, int target) {
            int s = 0, e = nums.length - 1;
            
            while (s <= e) {
                int mid = (s + e) / 2;
                
                if (nums[mid] == target) {
                    return mid;
                }
                
                // Check which part is sorted
                if (nums[s] <= nums[mid]) { // Left part is sorted
                    if (nums[s] <= target && target < nums[mid]) {
                        e = mid - 1; // Search in left
                    } else {
                        s = mid + 1; // Search in right
                    }
                } else { // Right part is sorted
                    if (nums[mid] < target && target <= nums[e]) {
                        s = mid + 1; // Search in right
                    } else {
                        e = mid - 1; // Search in left
                    }
                }
            }
            
            return -1;
        }
    }
    
}
