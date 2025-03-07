import java.util.HashSet;

public class longest_substring_withoutrepeat {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        HashSet<Character> window = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            
            // Remove characters from left until unique
            while (window.contains(c)) {
                window.remove(s.charAt(left));
                left++;
            }

            // Add character and update max length
            window.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}

}
