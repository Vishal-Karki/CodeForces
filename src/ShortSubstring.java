import java.util.Scanner;

public class ShortSubstring {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt(); int i;
        for(i=0;i<t;i++){
            String str = s.next();
            StringBuilder ans = new StringBuilder();
            ans.append(str.charAt(0));
            for(int j=1;j<str.length();j++){
                ans.append(str.charAt(j));
                if(j%2!=0)
                    j++;
            }

            System.out.println(ans);

        }
    }
}
