import java.util.Scanner;

public class MagicalSticks {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();

        for(int z=0;z<T;z++){
        int  n = s.nextInt();
         int ans = (n + 1)/2;
            System.out.println(ans);
        }
    }
}
