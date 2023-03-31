import java.util.Scanner;

public class UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rec(s, 0));
    }

    public static String rec(String s, int idx) {
        if (idx >= s.length())
            return " "; // empty string
        if (Character.isUpperCase(s.charAt(idx))) {
            return s.substring(idx, s.length()); // Print till end
        }
      return  rec(s, idx + 1); // else move to next element
    }

}
