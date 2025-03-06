public class longest_prefix {
    class Solution {
        public String longestCommonPrefix(String[] strs) {
            if (strs == null || strs.length == 0) return "";
     
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < strs[0].length(); j++) {
                char ch = strs[0].charAt(j);
                
                for (int i = 1; i < strs.length; i++) {
                    if (j >= strs[i].length() || strs[i].charAt(j) != ch) {
                        return sb.toString();
                    }
                }
                sb.append(ch);///jhat kuch samjh aya h 
            }
            return sb.toString();
        }
     }
     
}
