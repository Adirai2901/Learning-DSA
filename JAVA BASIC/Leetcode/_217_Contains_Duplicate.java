import java.util.Arrays;
public class _217_Contains_Duplicate {
    // yeh mene kiya toh time limit exceeded error aa raha tha 
// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i = 0; i < nums.length;i++){
//             int checker = i+1;

//             while(checker < nums.length){
//                 if(nums[checker]== nums[i]){
//                     return true;
//                 }
//                 checker++;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums); // Sorting takes O(n log n)

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
// aur yeh cody code h 
}
