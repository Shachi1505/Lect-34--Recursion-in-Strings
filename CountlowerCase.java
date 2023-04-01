public class Count {
    public static void main(String[] args) {
        String s = " MahEshMati";
               System.out.println(check(s, 0)); // calling recursion

    }

    public static int check(String s, int idx) {
        // Base Case
        if (idx == s.length() - 1) {
            // ASCII values for lower case
            if (s.charAt(idx) >= 97 && s.charAt(idx) <= 122)
                return 1;
            else
                return 0;
        }
        if (s.charAt(idx) >= 97 && s.charAt(idx) <= 122)
            return check(s, idx + 1) + 1; // If lower case inc count by 1.
        else
            return check(s, idx + 1); // move to next index and analyse
    }
}
