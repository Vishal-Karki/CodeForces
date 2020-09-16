import java.util.Scanner;

public class MinimalSquare {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z = 0;z < T;z++){
            int a = s.nextInt(); int b = s.nextInt();
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            if( 2*min >= max)
                System.out.println(2*min*min*2);
            else
                System.out.println(max*max);
        }
    }
}
