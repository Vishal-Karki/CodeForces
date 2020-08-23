import java.util.Scanner;

public class Tram {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int a=0,b=0;
        int cap=0,ans =0;
        for (int i=0;i<n;i++){
            a=s.nextInt(); b = s.nextInt();
            cap = cap -a;
            cap = cap +b;
            if ( cap >= ans )
                ans = cap;
        }
        System.out.println(ans);
    }
}
