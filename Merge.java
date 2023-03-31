import java.util.Scanner;
public class Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1st string");
        String a = sc.nextLine();
        System.out.println("Next string");
        String b = sc.nextLine();
        System.out.println(merge(a, b));
    }

    public static String merge(String a, String b) {
        String ans = "";
        if(a.length()==0) return ans+b;
        if(b.length()==0) return ans+a;
        ans += a.substring(0,1);
        ans += b.substring(0,1);
        ans += merge(a.substring(1,a.length()),b.substring(1,b.length()));

    return ans;
    }  
    }
