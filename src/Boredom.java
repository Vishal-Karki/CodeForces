import java.util.Arrays;
import java.util.Scanner;

public class Boredom {
    private static Scanner s = new Scanner(System.in);
    static final int N = 100005;
    public static void main(String[] args) {
        int n = s.nextInt();
        int[] c = new int[N];

        int num;
        for(int i=0;i<n;i++){
            num = s.nextInt();
            c[num]++;
        }

        int[] dp = new int[N];
        Arrays.fill(dp,0);

        dp[0] = 0;
        dp[1] = c[1];
        int ans = 0;
        for(int i=2;i<n;i++){
            dp[i] = max( dp[i-1] , dp[i-2]+( i*c[i]) );
            ans = Math.max(ans,dp[i]);
        }

        System.out.println( ans );
    }
    static int max(int a,int b){
        return Math.max(a, b);

    }

}
