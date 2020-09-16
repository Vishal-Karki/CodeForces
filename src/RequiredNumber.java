import java.util.Scanner;

public class RequiredNumber {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int T = s.nextInt();
        for(int z=0;z<T;z++){
            int x = s.nextInt(); int y = s.nextInt(); int n = s.nextInt();
            int ans =  n - n%x + y;
            if( ans > n)
                System.out.println( n - n%x - ( x - y ) );
            else
                System.out.println(ans);


        }
    }
}
