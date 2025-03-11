class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word.insert(0, s.charAt(i));  // Build the word in reverse
            } else if (word.length() > 0) {
                sb.append(word).append(" ");  // Append the collected word and a space
                word.setLength(0);  // Clear the word builder
            }
        }

        // Add the last word if any
        if (word.length() > 0) {
            sb.append(word);
        }

        return sb.toString();
    }
}
