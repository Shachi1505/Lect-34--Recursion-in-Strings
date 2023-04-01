public class Consonants {
    public static boolean isConsonant(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return false; // if a vowel
        }
        return true;
    }

    public static int totalconso(String s, int n) {
        if (n == 1) {
            if (isConsonant(s.charAt(0))) {
                return 1;
            } else
                return 0;
        }
        if (isConsonant(s.charAt(n - 1)))
            return totalconso(s, n - 1) + 1; // if consonant, we increase count by 1
        else
            return totalconso(s, n - 1);
    }

    public static void main(String[] args) {
        String s = "Maheshmati";
        System.out.println(totalconso(s, s.length()));
    }
}
