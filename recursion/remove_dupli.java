public class remove_dupli {

    public static String remove(String s, int i, StringBuilder ss) {
        if (i == s.length() - 1) {
            ss.append(s.charAt(i));
            return ss.toString();
        }
        if (s.charAt(i) != s.charAt(i + 1)) {
            ss.append(s.charAt(i));
        }

        return remove(s, i + 1, ss);
    }

    public static void main(String[] args) {
        String s = "aaaddddiityaaa       rrraai";
        System.out.println(remove(s, 0, new StringBuilder()));

    }
}
