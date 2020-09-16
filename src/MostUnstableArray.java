import java.util.Scanner;

public class MostUnstableArray {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();

        for(int z =0; z<T;z++){
            int n = s.nextInt(); int m = s.nextInt();

            System.out.println(    (Math.min( 2 , n-1)*m)   );

        }
    }
}
