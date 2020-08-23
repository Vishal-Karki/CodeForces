import java.util.Scanner;

public class XenieAndRingroad {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt(); int m = s.nextInt();
        int[] arr = new int[m];
        int loc = 1;
        int now, ans = 0;
        for (int i = 0; i < m; i++) {
            arr[i] = s.nextInt();
            now = arr[i];
            if (now >= loc)
                ans += now - loc;
            else
                ans += n - (loc - now);
            loc = now;
        }
        System.out.println(ans);
    }
}
