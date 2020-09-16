import java.util.Scanner;

public class MaximumGCD {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();

        for(int z=0;z<t;z++){
            int n = s.nextInt();

            System.out.println(n/2);
        }

    }
    static int GCD(int a, int b){
        int Max = Math.max(a,b);
        int Min = Math.min(a,b);
        int gcd=1;
        for(int i=1;i<=Min;i++){
            if(a%i == 0 && b%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
