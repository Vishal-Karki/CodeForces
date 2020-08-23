import java.util.Scanner;

public class UltrafastMathamatician {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        String x = s.next();
        String y = s.next();
        String ans = "";
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) != y.charAt(i))
                ans += '1';
            else ans += '0';
        }
        System.out.println(ans);

    }
}
