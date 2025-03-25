public class _242_ {
    class Solution {
        public boolean isAnagram(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            for(int i = 0 ; i < s.length();i++){
                String ch = String.valueOf(s.charAt(i));
                if(!t.contains(ch)){
                    return false;
                }
                t = t.replaceFirst(ch, "");
            }
            return true;
        }
    }
    
    // import java.util.Arrays;
    
    // class Solution {
    //     public boolean isAnagram(String s, String t) {
    //         if (s.length() != t.length()) return false;
    
    //         char[] sArray = s.toCharArray();
    //         char[] tArray = t.toCharArray();
    //         Arrays.sort(sArray);
    //         Arrays.sort(tArray);
    
    //         return Arrays.equals(sArray, tArray);
    //     }
    // }
    //gpt ka code 
}
